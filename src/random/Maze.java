package random;

import java.util.Arrays;

public class Maze
{
    public static void main(String[] args)
    {
        int[][] matrix = new int[7][7];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[0][j] = 1;
                matrix[6][j] = 1;

                matrix[i][0] = 1;
                matrix[i][6] = 1;

                matrix[0][4] = 0;

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        for (int y_axis = 0; y_axis < matrix.length; y_axis++)
//        {
//            for (int x_axis = 0; x_axis < matrix[y_axis].length; x_axis++)
//            {
//                matrix[y_axis][x_axis] = (int) (Math.random() * 2);
//                System.out.print(y_axis + " ");
//            }
//            System.out.println();
//        }
    }
}
