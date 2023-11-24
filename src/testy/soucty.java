package testy;

import java.util.Arrays;
import java.util.Scanner;

public class soucty
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vyber funkci 1-3: ");
        int vyber = sc.nextInt();
        System.out.println("----");
        switch (vyber)
        {
            case 1 : znamky();
            break;
            case 2 : zaporny();
            break;
            case 3 : nejmensiCislo();
            break;
        }
    }

    private static void znamky()
    {
        int[] znamka = new int[7];
        double soucet = 0;
        double prumer;

        for (int i = 0; i < znamka.length; i++)
        {
            znamka[i] = (int)(Math.random() * 5 + 1);
            System.out.println(znamka[i]);
            if (znamka[i] > 2)
            {
                System.out.println("Nemá vyznamenání");
                return;
            }
            soucet += znamka[i];
        }
        prumer = soucet / znamka.length;

        if (prumer <= 1.5)
        {
            System.out.println("Má vyznamenání");
        }
    }

    private static void zaporny()
    {
        int[] pole = new int[20];
        int soucet = 0;

        for (int i = 0; i < pole.length; i++)
        {
            pole[i] = (int)(Math.random() * 200 - 100);
            soucet += pole[i];
        }
        if (soucet < 0)
        {
            System.out.println(soucet);
        }
        else
        {
            System.err.println(soucet);
        }
    }

    private static void nejmensiCislo()
    {
        int[] pole = new int[50];
        int temp;

        for (int i = 0; i < pole.length; i++)
        {
            pole[i] = (int)(Math.random() * 200 - 100);
        }
        for (int i = 0; i < pole.length; i++)
        {
            for (int j = 0; j < pole.length - 1; j++)
            {
                if (pole[j] > pole[j + 1])
                {
                    temp = pole[j];
                    pole[j] = pole[j + 1];
                    pole[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(pole));
        for (int i = 0; i < pole.length; i++)
        {
            if (pole[i] > 0)
            {
                System.out.println("Nejmenší kladné číslo je: " + pole[i]);
                return;
            }
        }
    }
}
