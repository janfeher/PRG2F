package testy;

import java.util.Scanner;

public class soucet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int cislo = sc.nextInt();
        int soucet = 0;
        System.out.print("Scitani cisel: ");
        for (int i = cislo; i > 0; i--)
        {
            soucet += i;
            System.out.print(i + " ");
        }
        System.out.println("\nSoucet: " + soucet);
    }
}
