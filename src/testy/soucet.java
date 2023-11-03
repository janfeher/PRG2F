package testy;

import java.util.Scanner;

public class soucet
{
    public static void main(String[] args)
    {
        System.out.print("\nNapis cislo k secteni: ");
        Scanner sc = new Scanner(System.in);

        int cislo = sc.nextInt();
        int soucet = 0;
        System.out.print("Scitani cisel: ");
        for (int i = cislo; i > 0; i--)
        {
            soucet += i;
            if (i == 1)
            {
                System.out.print(i);
            }
            else
            {
                System.out.print(i + " + ");
            }
        }
        System.out.println("\nSoucet: " + soucet);
    }
}
