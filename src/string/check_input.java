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
            System.out.println(parts[i]);
            if (!(address_part >= 0 && address_part <= 256)) {
                System.out.println("Address doesn't have right numbers");
                break;
            }
            if (parts.length != 4) {
                System.out.println("Address is not the right length");
                break;
            }
            if (parts[i].isEmpty()) {
                System.out.println("Address is missing a number");
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
