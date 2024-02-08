package matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> phoneList = new ArrayList<>();
        System.out.println("Zadavej ceska telefonni cisla: ");
        String input = sc.nextLine();
        boolean notADigit = false;
        while (!input.equals("konec")) {
            if (input.charAt(0) == '+') {
                for (int i = 0; i < input.length(); i++) {
                    if (!Character.isDigit(input.charAt(i))) {
                        notADigit = true;
                        break;
                    }
                }
                if (!notADigit) {
                    System.out.println("Added:");
                    phoneList.add(input);
                }
            }
            input = sc.nextLine();
        }
        for (int i = 0; i < phoneList.size(); i++) {
            // if (phoneList.get(i))
        }
        System.out.println(phoneList);
    }
}
