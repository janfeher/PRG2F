package matrix;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class SubnetPrefix {
    private static int[] dec_bin(int[] address) {
        int[] bin = new int[4];
        for (int i = address.length - 1, j = 0; i >= 0; i--, j++) {
            while (address[j] > 1) {
                bin[i] = address[j] % 2;
                address[j] /= 2;
            }
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] prefixPart = input.split("/");
        String[] part = prefixPart[0].split("\\.");

        int[] address = new int[4];
        int prefix = parseInt(prefixPart[1]);
        for (int i = 0; i < address.length; i++) {
            address[i] = parseInt(part[i]);
        }
        System.out.println(Arrays.toString(address));
        System.out.println(prefix);

        System.out.println(Arrays.toString(dec_bin(address)));
    }
}
