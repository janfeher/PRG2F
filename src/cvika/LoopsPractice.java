package cvika;

import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {
        System.out.println("Zadej čísla, zadávání ukončíš zadáním -1");
        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        while (input != -1) {
//            if (input % 2 == 0) {
//                System.err.println(input);
//            }
//            input = sc.nextInt();
//        }
//        System.out.println("Zadej maximální číslo:");
//        input = sc.nextInt();
//        for (int i = 0; i < input; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
        System.out.println("Zadej číslo:");
        int input = sc.nextInt();
        boolean prime;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                prime = false;
                break;
            }
        }
    }
}
