package cycles;

import java.util.Arrays;

public class BinaryArrays
{
    public static void main(String[] args)
    {
        int[] binary = new int[10];
        int[] binaryPozpatku = new int[binary.length];
        int n = 0;
        int vysledek = 0;

        for (int i = 0; i < binary.length; i++)
        {
            binary[i] = (int) (Math.random() * 2);
        }
        System.out.println("Binární číslo k převodu: " + Arrays.toString(binary));

        for (int i = binary.length - 1; i >= 0; i--)
        {
            binaryPozpatku[n] = binary[i];
            n++;
        }

        for (int i = 0; i < binaryPozpatku.length; i++)
        {
            vysledek += binaryPozpatku[i] * (int) Math.pow(2, i);
        }
        System.out.println("Decimální číslo: " + vysledek);
    }
}
