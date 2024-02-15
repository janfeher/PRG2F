package matrix;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class priprava_na_test {
    public static void main(String[] args) {
        String[][] pole = new String[4][5];
        int max = 0;
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                pole[i][j] = String.valueOf((int) (Math.random() * 10 + 1));
                if (pole[i][j].length() > max) {
                    max = pole[i][j].length();
                }
            }
        }

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                switch (pole[i][j]) {
                    case "1":
                        System.out.print("\u001b[31m" + pole[i][j] + " ".repeat(max - pole[i][j].length() + 3) + "\u001b[0m");
                        break;
                    case "10":
                        System.out.print("\u001b[32m" + pole[i][j] + " ".repeat(max - pole[i][j].length() + 3) + "\u001b[0m");
                        break;
                    default:
                        System.out.print(pole[i][j] + " ".repeat(max - pole[i][j].length() + 3));
                        break;
                }
            }
            System.out.println();
        }
    }
}
