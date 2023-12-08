package advent_of_code;

public class day_1 {
    public static void main(String[] args) {
        String chars = "2xjzgsjzfhzhm1";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < chars.length(); j++) {
                String number = String.valueOf(i);
                if (String.valueOf(i).equals(chars.charAt(j))) {
                    System.err.println(chars.charAt(j));
                }
            }
        }
    }
}
