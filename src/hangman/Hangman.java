package hangman;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        for (String word : Word.words) {
            System.out.println(word);
        }

        System.out.println(Word.words.size());
    }
}
