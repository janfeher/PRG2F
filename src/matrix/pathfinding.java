package matrix;

import java.util.Arrays;

public class pathfinding {
    public static void main(String[] args) {
        int[][] map = new int[10][10];
        int[] start = {0, 0};
        int[] finish = {4, 4};

        for (int[] ints : map) {
            Arrays.fill(ints, 0);
        }

        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                map[start[0]][start[1]] = 1;
                map[finish[0]][finish[1]] = 2;
                System.out.print(map[y][x] + "  ");
            }
            System.out.println();
        }
    }
}
