package matrix;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class radek {
    public static void main(String[] args) {
        String scanner = JOptionPane.showInputDialog("Radek nebo sloupec:");

        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j + i * matrix.length + 1;
            }
        }

        if (scanner.equals("radek")) {
            radek(matrix);
        } else if (scanner.equals("sloupec")) {
            sloupec(matrix);
        }
    }

    private static void radek(int[][] matrix) {
        String sc_radek = JOptionPane.showInputDialog("Zadej cislo radku:");
        int input = parseInt(sc_radek);
        System.out.println((input + 1) + ". radek:  ");
        for (int i = 0; i < matrix[input].length; i++) {
            System.out.print(matrix[input][i] + " ");
        }
        System.out.println();
    }

    private static void sloupec(int[][] matrix) {
        String sc_sloupec = JOptionPane.showInputDialog("Zadej cislo sloupce:");
        int input = parseInt(sc_sloupec);
        System.out.println((input + 1) + ". sloupec:  ");
        for (int i = 0; i < matrix[input].length; i++) {
            System.out.print(matrix[i][input] + " ");
        }
        System.out.println();
    }
}
