package cycles;

import java.util.Arrays;
import java.util.Scanner;

public class GuessArray
{
    public static void main(String[] args)
    {
        int[] guessArray = new int[6];
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int guess;
        int hit = 0;

        for (int i = 0; i < guessArray.length; i++)
        {
            guessArray[i] = (int)(Math.random() * 15 + 1);
        }

        System.out.println(Arrays.toString(guessArray));

        for (int i = 0; i < 7; i++)
        {
            System.out.println("Tipni cislo:");
            guess = sc.nextInt();
            for (int j = 0; j < guessArray.length; j++)
            {
                if (guess == guessArray[j])
                {
                    score += 100;
                    System.out.println("Uhadl jsi!");
                    guessArray[j] = -1;
                    System.out.println(Arrays.toString(guessArray));
                    hit += 1;
                    break;
                }
            }
            if (hit == guessArray.length)
            {
                break;
            }
        }

        System.out.println("Game Over, score: " + score);
        System.out.println(hit);
    }
}
