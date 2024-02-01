package matrix;

import java.util.ArrayList;

public class basics {
    public static void main(String[] args) {
        ArrayList<Integer> expansiveArray = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            expansiveArray.add((int) (Math.random() * 100 + 1));
            System.out.print(expansiveArray.get(i) + " ");
        }
    }
}
