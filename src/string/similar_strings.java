package string;

import java.lang.String;
import java.util.Objects;
import java.util.Scanner;

public class similar_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names = "Jan;Karel;Eva;Franta";
        String[] parts = names.split(";");

        String[] input;

        while (true) {
            input = sc.nextLine().split("");
            for (int i = 0; i < parts.length; i++) {
                System.out.println(parts[i]);
//                for (int j = 0; j < input.length; j++) {
//                    System.out.println(parts[j]);
//                }
//                System.out.println();
            }
        }
    }
}
