package uvod;

import java.util.Scanner;

public class tabulka
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int strana = sc.nextInt();
        for(int i = 1; i <= (strana * strana); i++)
        {
            System.out.print(" ");
            if (i < 10)
            {
                System.out.print(" ");
                System.out.print(i);
            }
            else
            {
                System.out.print("");
                System.out.print(i);
            }
            if (i % strana == 0)
            {
                System.out.print("\n");
            }
        }
    }
}
