package matrix;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class tabulka {
    public static void main(String[] args) {
        String max = "0";
        String rozsah_i = JOptionPane.showInputDialog("Zadej velikost na ose I:");
        String rozsah_j = JOptionPane.showInputDialog("Zadej velikost na ose J:");
        String max_cislo = JOptionPane.showInputDialog("Zadej maximální číslo:");

        System.out.println("Maximální číslo: " + max_cislo);
        System.out.println("Velikost I: " + rozsah_i);
        System.out.println("Velikost J: " + rozsah_j + "\n");

        String[][] array = new String[parseInt(rozsah_i)][parseInt(rozsah_j)];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf((int) (Math.random() * parseInt(max_cislo) + 1));
                if (parseInt(array[i][j]) > parseInt(max)) {
                    max = String.valueOf(array[i][j]);
                }
                System.out.print(array[i][j] + " ".repeat(max.length() - array[i][j].length() + 1));
            }
            System.out.println();
        }
    }
}