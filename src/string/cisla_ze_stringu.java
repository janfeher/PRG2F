package string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class cisla_ze_stringu {
    public static void main(String[] args) {
        File words = new File("src/string/input.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(words))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isDigit(line.charAt(i))) {
                        System.out.print(line.charAt(i) + ", ");
                        System.out.println();
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
