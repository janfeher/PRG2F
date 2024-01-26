package matrix;

public class prumer {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j + i * matrix.length + 1;
            }
        }

        int soucet;
        double prumer;

        for (int i = 0; i < matrix.length; i++) {
            soucet = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                soucet += matrix[i][j];
            }
            prumer = (double) soucet / matrix[i].length;
            System.out.println((i + 1) + ". radek:  " + prumer);
        }
    }
}
