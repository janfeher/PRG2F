package testy;

import java.util.Scanner;

public class prumer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nPrumery z cisel:\n");
        int cislo = sc.nextInt();
        double soucet = 0;
        int pocet = 0;

        while(cislo != -1)
        {
            soucet += cislo;
            pocet++;
            cislo = sc.nextInt();
        }
        double prumer = soucet / pocet;
        System.out.println("\nPocet cisel: " + pocet);
        System.out.println("Prumer: " + prumer);
    }
}
