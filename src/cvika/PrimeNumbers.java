package cvika;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej maximální hranici");
        int input = sc.nextInt();
        for (int i = 2; i < input; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0 && i != j) {
                    System.out.println(i);
                }
            }
        }
    }
}
