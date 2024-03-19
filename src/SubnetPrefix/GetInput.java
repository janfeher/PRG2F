package SubnetPrefix;

import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] address;
        int prefix = 24;
        input = input.replaceAll(" ", "");
        if (input.contains("/"))
        {
            String[] part = input.split("/");
            address = part[0].split("\\.");
            prefix = Integer.parseInt(part[1]);
        } else {
            address = input.split("\\.");
        }
        for (int i = 0; i < address.length; i++) {

        }
    }
}
