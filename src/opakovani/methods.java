package opakovani;

public class methods {
    private static double discriminant(double a, double b, double c) {
        return b*b - 4 * a * c;
    }

    private static double[] quadraticEquation(double a, double b, double c) {
        double discriminant = discriminant(a, b, c);
        if (discriminant <= 0) {
            return new double[]{Double.NaN};
        }
        double x1 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
        double x2 = ((-b) - Math.sqrt(discriminant)) / (2 * a);

        return new double[]{x1, x2};
    }

    public static void main(String[] args) {
        double[] result = quadraticEquation(1, 2, -3);
        if (Double.isNaN(result[0])) {
            System.out.println("Discriminant je zaporny");
        } else {
            for (int i = 0; i < result.length; i++) {
                if (result[i] >= 0) {
                    System.out.println("X" + (i + 1) + ":  " + result[i]);
                } else {
                    System.out.println("X" + (i + 1) + ": " + result[i]);
                }
            }
        }
    }
}
