package hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Word {
    static ArrayList<String> words = new ArrayList<>();

    static File file = new File("src/hangman/words_db.txt");
    static Scanner sc;
    static {
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                words.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static String generate() {
        int wordIndex = (int) (Math.random() * words.size());
        return words.get(wordIndex);
    }
}