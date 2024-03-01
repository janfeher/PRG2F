package testy;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        ArrayList<String> username = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("konec")) {
            boolean opakuje = false;
            for (int i = 0; i < username.size(); i++) {
                if (username.contains(input)) {
                    System.out.println("opakuje se");
                    opakuje = true;
                    break;
                }
            }
            if (input.length() >= 4 && !opakuje) {
                System.out.println("pridano");
                username.add(input);
            }
            input = sc.nextLine();

        }
        System.out.println("konec");
        System.out.println(username);
    }
}
