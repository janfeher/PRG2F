package random;

public class Maze
{
    public static void main(String[] args)
    {
        String[][] matrix = new String[7][7];

        for (int y = 0; y < matrix.length; y++)
        {
            for (int x = 0; x < matrix[y].length; x++)
            {
                matrix[y][x] = "0";
            }
        }

        for (int y = 0; y < matrix.length; y++)
        {
            for (int x = 0; x < matrix[y].length; x++)
            {
                matrix[0][x] = "/";
                matrix[6][x] = "/";

                matrix[y][0] = "/";
                matrix[y][6] = "/";

                matrix[0][4] = "-";
                matrix[6][3] = "-";

                System.out.print(matrix[y][x] + " ");
            }

            System.out.println();
        }

        System.out.println();

        for (int y = 1; y < matrix.length - 1; y++)
        {
            for (int x = 1; x < matrix[y].length - 1; x++)
            {
                matrix[y][x] = String.valueOf((int) (Math.random() * 2));
                System.out.print(matrix[y][x] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int y = 0; y < matrix.length; y++)
        {
            for (int x = 0; x < matrix[y].length; x++)
            {
                System.out.print(matrix[y][x] + " ");
            }
            System.out.println();
        }
    }
}
