package hangman;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Word {
    static ArrayList<String> words = new ArrayList<>();

    static File file = new File("C:\\Users\\jan.feher\\IdeaProjects\\PRG2F\\src\\hangman\\words_db.txt");

    static boolean populate() {
        words.add("neco");
        words.add("neco jinyho");

        return words.size() > 0 ? true : false;
    }

    static String generate() {
        int wordIndex = (int) (Math.random() * words.size());
        String word = words.get(wordIndex);

        return word;
    }
}