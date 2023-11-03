package cycles;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej maximalni hranici");
        int input = sc.nextInt();
        boolean prime;
        for (int i = 2; i < input; i++) {
            prime = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    prime = false;
                }

            }

            if (prime) {
                System.out.println(i);
            }
        }
    }

}
