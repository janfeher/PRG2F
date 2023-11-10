package cycles;

import java.util.Arrays;

public class RandomIntervals
{
    public static void main(String[] args)
    {
        int[] array = new int[20];

        // Generování čísel
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 100 - 50);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("----");

        int i;
        int j = array.length - 1;
        // Seřazování
        for (i = 0; i <= array.length / 2 - 1; i++) {
            System.out.println(array[i]);
            System.out.println(array[j]);
            j--;
        }
        if (array.length % 2 == 1)
        {
            System.out.println(array[i]);
        }
    }
}
