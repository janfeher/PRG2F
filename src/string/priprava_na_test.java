package string;

import java.lang.String;
import java.util.Scanner;

public class priprava_na_test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] users = {"Jan", "Karel", "Eva", "Frantisek"};
        String userName = "";

        outer:
        while (true) {
            userName = input.nextLine();

            for (int i = 0; i < users.length; i++) {
                if (userName.toLowerCase().equals(users[i].toLowerCase())) {
                    System.out.println(userName + " se shoduje s indexem " + i + " (" + users[i] + ")");
                } else if (!userName.equals("-1")) {
                    System.out.println(userName + " se neshoduje");
                    break;
                } else {
                    System.out.println("Konec");
                    break outer;
                }
            }
        }
    }
}
