package testy;

public class matrix2 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int ii = 0; ii < matrix[i].length; ii++) {
                matrix[i][ii] = (int) (Math.random() * 9 + 1);
                System.out.print(matrix[i][ii] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            int big = 0;
            for (int ii = 0; ii < matrix[i].length; ii++) {
                if (matrix[i][ii] > big) {
                    big = matrix[i][ii];
                }
            }
            System.out.println(big);
        }
    }
}
