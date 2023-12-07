package advent_of_code;

public class day_1 {
    public static void main(String[] args) {
        char[] number = "2xjzgsjzfhzhm1".toCharArray();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < number.length; j++) {
                if (number[j] == i) {
                    System.err.println(number[j]);
                }
            }
        }
    }
}
