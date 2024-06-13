package hangman;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (Word.populate()) {
            String word = Word.generate();
        }
    }
}
