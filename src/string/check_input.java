package string;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class check_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adresa = JOptionPane.showInputDialog("Zadej IP adresu:");
        System.out.println(adresa);
        System.out.println("Zadal jsi: " + adresa);

        String[] parts = adresa.split("\\.");
        int i = 0;
        int address_part = Integer.parseInt(parts[i]);
        outer:
        for (i = 0; i < parts.length; i++) {
            if (parts.length != 4) {
                break;
            }
            for (int j = 0; j < parts[i].length(); j++) {
                char current = parts[i].charAt(j);
                if (!Character.isDigit(current)) {
                    System.out.println("Address does not contain a number");
                    break outer;
                }
            }
        }
    }
}
