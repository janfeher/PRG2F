package string;

import java.lang.String;
import java.util.Scanner;

public class priprava_na_test {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        typ_souboru();
    }

    private static void username_db() {
        String[] users = {"Jan", "Karel", "Eva", "Frantisek"};
        String userName;

        outer:
        while (true) {
            userName = input.nextLine();

            for (int i = 0; i < users.length; i++) {
                if (userName.equalsIgnoreCase(users[i])) {
                    System.out.println(userName + " se shoduje s indexem " + i + " (" + users[i] + ")");
                    break;
                } else if (i == users.length - 1) {
                    System.out.println(userName + " se neshoduje");
                } else if (userName.equals("-1")) {
                    System.out.println("Konec");
                    break outer;
                }
            }
        }
    }
    
    private static void zdvojena_pismena() {
        String[] text = {"Velikonoce", "Halloween"};

        outer:
        for (int i = 0; i < text.length; i++) {
            char[] pismena = text[i].toCharArray();
            for (int j = 0; j < pismena.length - 1; j++) {
                if (pismena[j] == pismena[j + 1]) {
                    System.out.println("Ano");
                    break;
                } else if (j == pismena.length - 2) {
                    System.out.println("Ne");
                }
            }
        }
    }

    private static void opposite_case() {
        String[] oppositeCase = "abchdeirjgwhf".split("");

        for (int i = 0; i < oppositeCase.length; i++) {
            if (i % 2 == 0) {
                oppositeCase[i] = oppositeCase[i].toLowerCase();
            } else {
                oppositeCase[i] = oppositeCase[i].toUpperCase();
            }
            System.out.print(oppositeCase[i]);
        }
    }

    private static void veta() {
        String[] words = "Příliš žluťoučký kůň úpěl ďábelské ódy".split(" ");

        System.out.println("Pocet slov: " + words.length);
    }

//    private static void names_db() {
//        String[] jmena = {"Jan", "Karel", "František Dlouhojmenný", "Pablo Diego José Francisco de Paula Juan Nepomuceno María de los Remedios Cipriano de la Santisima Trinidad Ruiz y Picasso", "Eva"};
//
//        for (int i = 0; i < jmena.length; i++) {
//        }
//    }

    private static void cislo() {
        String number = "4200";

        for (int i = number.length() - 1; i >= 0; i--) {
            System.out.print(number.charAt(i));
        }
    }

    private static void typ_souboru() {
        String name = "song";
        String extension = input.nextLine();
        String fileName;

        if (extension.charAt(0) == '.') {
            fileName = name + extension;
        } else {
            fileName = name + "." + extension;
        }

        System.out.println(fileName);
    }
}
