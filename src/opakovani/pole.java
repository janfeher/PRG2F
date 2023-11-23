package opakovani;

import java.util.Arrays;
import java.util.Scanner;

public class pole
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Délka pole: ");
        int delkaPole = sc.nextInt();
        int[] pole = new int[delkaPole];

        System.out.println("----");

        System.out.print("Vygenerované pole: ");
        for (int i = 0; i < pole.length; i++)
        {
            pole[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(pole));

        System.out.println("----");

        int sude = 0;
        int liche = 0;
        for (int i = 0; i < pole.length; i++)
        {
            if (pole[i] % 2 == 0)
            {
                sude += pole[i];
            } else
            {
                liche += pole[i];
            }
        }
        System.out.println("Součet sudých čísel: " + sude);
        System.out.println("Součet lichých čísel: " + liche);

        System.out.println("----");

        System.out.print("Odmocniny čísel z pole: ");
        int[] odmocnina = new int[pole.length];
        for (int i = 0; i < pole.length; i++)
        {
            odmocnina[i] = (int) Math.sqrt(pole[i]);
        }
        System.out.println(Arrays.toString(odmocnina));

        System.out.println("----");

        System.out.print("Napiš hledanou hodnotu: ");
        int hodnota = sc.nextInt();
        int[] vyskyt = new int[pole.length];
        int hit = 0;
        Arrays.fill(vyskyt, 0);
        for (int i = 0; i < pole.length; i++)
        {
            if (hodnota == pole[i])
            {
                vyskyt[i] = 1;
                hit++;
            }
        }
        System.out.println("Vyskytuje se: " + hit + "×");
        System.out.print("Indexy: ");
        for (int i = 0; i < vyskyt.length; i++)
        {
            if (vyskyt[i] == 1)
            {
                hit--;
                if (hit > 0)
                {
                    System.out.print(i + ", ");
                } else if (hit == 0)
                {
                    System.out.println(i);
                }
            }
        }

        System.out.println("----");

        int[] prazdnePole = new int[10];
        int fronta;
        for (int i = 0; i < prazdnePole.length; i++)
        {
            System.out.print("Zadej číslo: ");
            fronta = sc.nextInt();
            while (fronta < 10 || fronta > 100)
            {
                System.out.print("Nevhodné číslo, zadej nové: ");
                fronta = sc.nextInt();
            }
            prazdnePole[i] = fronta;
        }
        System.out.println("Nové zaplněné pole: " + Arrays.toString(prazdnePole));

        System.out.println("----");


    }
}
