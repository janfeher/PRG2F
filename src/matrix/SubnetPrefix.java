package matrix;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class SubnetPrefix {
    private static int[][] dec_bin(int[] address) {
        int[][] result = new int[4][8];
        int[] copy_address = address.clone();
        for (int i = 0; i < result.length; i++) {
            for (int j = result[i].length - 1; j >= 0; j--) {
                result[i][j] = copy_address[i] % 2;
                copy_address[i] /= 2;
            }
        }

        return result;
    }

    private static int[] mask(int prefix) {
        int[] result = new int[32];
        Arrays.fill(result, 1);
        for (int i = result.length - 1; i >= prefix; i--) {
            result[i] = 0;
        }

        return result;
    }

    private static int address_count(int prefix) {
        return (int) Math.pow(2, 32 - prefix);
    }

    private static int min_prefix(int[] subnet_prefix) {
        int min = 30;
        for (int i = 0; i < subnet_prefix.length; i++) {
            if (subnet_prefix[i] < min) {
                min = subnet_prefix[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int subnet_count = sc.nextInt();
        String[] part;
        int prefix = 24;
        if (input.contains("/")) {
            String[] prefixPart = input.split( "/");
            part = prefixPart[0].split("\\.");
            prefix = parseInt(prefixPart[1]);
        } else {
            part = input.split("\\.");
        }

        int[] address = new int[4];
        for (int i = 0; i < address.length; i++) {
            address[i] = parseInt(part[i]);
        }
        int[][] bin_address = dec_bin(address);
        
        int[] subnet_hosts_count = new int[subnet_count];
        int[] subnet_prefix = new int[subnet_count];
        for (int i = 0; i < subnet_count; i++) {
            subnet_hosts_count[i] = sc.nextInt();
            for (int j = 8; address_count(j) - 2 >= subnet_hosts_count[i]; j++) {
                subnet_prefix[i] = j;
            }
        }

        int[][] subnet_address = new int[subnet_count][4];
        for (int i = 0, min, count; i < subnet_prefix.length; i++) {
            min = min_prefix(subnet_prefix);
            count = address_count(min);
            subnet_address[i][subnet_prefix[i] / 8] = address[i] + count;
        }

        System.out.println("Number of possible addresses: " + address_count(prefix));
        System.out.println("Number if subnets: " + subnet_count);
        System.out.println("Number of hosts in subnets: " + Arrays.toString(subnet_hosts_count));
        System.out.println("Prefixes of the hosts: " + Arrays.toString(subnet_prefix));
        System.out.println(Arrays.deepToString(subnet_address));
    }
}
