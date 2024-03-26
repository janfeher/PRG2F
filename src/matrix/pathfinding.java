package matrix;

import java.util.Arrays;
import java.util.Map;

public class pathfinding {
    private static final String RESET = "\u001B[0m";
    private static final String YELLOW = "\u001B[93m";
    private static final String BLUE = "\u001B[94m";

    public static void main(String[] args) {
        int[][] map = new int[10][10];
        int[] start = {0, 0};
        int[] finish = {4, 4};

        for (int[] ints : map) {
            Arrays.fill(ints, 0);
        }

        map[start[0]][start[1]] = 1;
        map[finish[0]][finish[1]] = 2;
        map[1][1] = 3;
        map[2][2] = 3;
        map[3][3] = 3;
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (map[y][x] == 1 || map[y][x] == 2) {
                    System.out.print(BLUE);
                } else if (map[y][x] == 3) {
                    System.out.print(YELLOW);
                }
                System.out.print("0  " + RESET);
            }
            System.out.println();
        }
    }
}
