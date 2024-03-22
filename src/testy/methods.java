package testy;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class methods {
    private static void newerDate(String date, String otherDate) {
        String[] date_split = date.split("\\.");
        String[] otherDate_split = otherDate.split("\\.");

        int[] month = {Integer.parseInt(date_split[1]), Integer.parseInt(otherDate_split[1])};
        int[] day = {Integer.parseInt(date_split[0]), Integer.parseInt(otherDate_split[0])};

        if (month[0] >= month[1]) {
            if (month[0] == month[1]) {
                if (day[0] > day[1]) {
                    System.out.println(date + " je novější");
                } else {
                    System.out.println(otherDate + " je novější");
                }
            } else {
                System.out.println(date + " je novější");
            }
        } else {
            System.out.println(otherDate + " je novější");
        }
    }

    private static int timeValues(String[] times) {
        int seconds = 0;
        String[][] time = new String[times.length][2];
        int[][] intTime = new int[times.length][2];

        for (int i = 0, j = 0; i < time.length; i++, j++) {
            time[i] = times[j].split(":");
        }
        for (int i = 0; i < time.length; i++) {
            for (int j = 0; j < time[i].length; j++) {
                intTime[i][j] = parseInt(time[i][j]);
            }
        }

        for (int i = 0; i < intTime.length; i++) {
            for (int j = 0; j < intTime[i].length; j++) {
                if (j == 0) {
                    seconds += intTime[i][j] * 60;
                } else {
                    seconds += intTime[i][j];
                }
            }
        }

        return seconds;
    }

    private static double cost(int length, boolean lakovat) {
        int count = length * 3;
        double cost = count * 33;
        if (lakovat) {
            cost = cost * 1.23;
        }

        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();
        String otherDate = sc.nextLine();
        newerDate(date, otherDate);

        String[] times = {"1:30", "1:30"};
        System.out.println(timeValues(times));

        int length = sc.nextInt();
        boolean lakovat = true;
        System.out.println(cost(length, lakovat));
    }
}
