package cycles;

import java.util.Arrays;

public class LowestNumber
{
    public static void main(String[] args)
    {
        int[] pole = new int[50];
        int minimum;

        for (int i = 0; i < pole.length; i++)
        {
            pole[i] = (int)(Math.random() * 200 - 100);
        }
        minimum = 100;
        for (int i = 0; i < pole.length - 1; i++)
        {
            if (minimum > pole[i] && pole[i] > 0)
            {
                minimum = pole[i];
            }
        }
        System.out.println(Arrays.toString(pole));
        System.out.println("Nejměnší kladné číslo: " + minimum);
    }
}
