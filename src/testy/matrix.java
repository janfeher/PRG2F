package testy;

public class matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                /* zak 1 */ {41, 35, 50, 45},
                /* hlupak */ {10, 22, 12, 15},
                /* zak 3 */ {33, 49, 42, 38},
        };

        for (int i = 0; i < matrix.length; i++) {
            int soucet = 0;
            outer:
            for (int ii = 0; ii < matrix[i].length; ii++) {
                if (matrix[i][ii] < 30) {
                    switch (i) {
                        case 0:
                            System.out.println("Zak 1 neprosel");
                            break outer;
                        case 1:
                            System.out.println("Zak 2 neprosel");
                            break outer;
                        case 2:
                            System.out.println("Zak 3 neprosel");
                            break outer;
                    }
                }
                soucet += matrix[i][ii];
            }
            if (soucet >= 100) {
                switch (i) {
                    case 0:
                        System.out.println("Zak 1 prosel");
                        break;
                    case 1:
                        System.out.println("Zak 2 prosel");
                        break;
                    case 2:
                        System.out.println("Zak 3 prosel");
                        break;
                }
            }
        }
    }
}
