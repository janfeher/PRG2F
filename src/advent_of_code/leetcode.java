package advent_of_code;

class Solution {
    public int sequence(int endInt, int price) {
        int result = 0;
        for (int i = 0; i <= endInt; i++) {
            result += i;
        }

        return result * price;
    }

    public int sequence(int endInt, int remainder, int price) {
        int result = sequence(endInt, price);

        return result + (remainder * price);
    }
}

public class leetcode {
    public static void main(String[] args) {
        int endInt = 9;
        int remainder = 4;
        int price = 129;
        Solution solution = new Solution();

        System.out.println("Result: $" + solution.sequence(endInt, remainder, price));
    }
}