package testy;

import java.lang.String;
import java.util.Scanner;

public class strings {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        phone_number();
        System.out.println("\n");
        spanish_phrases();
        System.out.println("\n");
        opposite_case();
    }

    private static void phone_number() {
        String phone_number;
        boolean valid = false;

        while (!valid) {
            phone_number = sc.nextLine();
            if (!(phone_number.charAt(0) == '+') || !(phone_number.length() == 13) || !(phone_number.contains("+420"))) {
                System.out.println("neni valid");
            }
            outer:
            if (phone_number.contains("+420") && phone_number.length() == 13) {
                for (int i = 1; i < phone_number.length(); i++) {
                    if (!(Character.isDigit(phone_number.charAt(i)))) {
                        System.out.println("neni valid");
                        break outer;
                    }
                }
                System.out.println("je valid");
                valid = true;
            }
        }
    }

    private static void spanish_phrases() {
        String text = "El Camino";

        if (text.toLowerCase().contains("el ") || text.toLowerCase().contains("al ")) {
            System.out.println("Ano");
        } else {
            System.out.println("Ne");
        }
    }

    private static void opposite_case() {
        String[] oppositeCase = {"hodnota1", "hodnota2", "hodnota3"};

        for (int i = 0; i < oppositeCase.length; i++) {
            if (i == 0) {
                oppositeCase[i] = oppositeCase[i].toUpperCase();
            } else if (i == oppositeCase.length - 1) {
                oppositeCase[i] = oppositeCase[i].toUpperCase();
            } else {
                oppositeCase[i] = oppositeCase[i].toLowerCase();
            }
            System.out.print(oppositeCase[i] + " ");
        }
    }
}
