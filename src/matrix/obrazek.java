package matrix;

public class obrazek {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j + i * matrix.length + 1;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(" ".repeat(matrix.length - i));
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
