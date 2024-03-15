package opakovani;

import static java.lang.Integer.parseInt;

public class methods {
//    private static double discriminant(double a, double b, double c) {
//        return b*b - 4 * a * c;
//    }

//    private static double[] quadraticEquation(double a, double b, double c) {
//        double discriminant = discriminant(a, b, c);
//        if (discriminant <= 0) {
//            return new double[]{Double.NaN};
//        }
//        double x1 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
//        double x2 = ((-b) - Math.sqrt(discriminant)) / (2 * a);
//
//        return new double[]{x1, x2};
//    }

    private static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int getMin(int[] arr) {
        int min = getMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    private static int timeValue(String time) {
        int seconds = 0;

        String[] split = time.split(":");
        int[] part = new int[split.length];
        for (int i = split.length - 1, j = 0; i >= 0; i--, j++) {
            part[j] = parseInt(split[i]);
            if (j == 0) {
                seconds += part[j];
            } else {
                seconds += part[j] * 60;
            }
        }
        return seconds;
    }

    private static double cena(int cena_za_m2, int vyska, int sirka) {
        double obsah = vyska * sirka;
        double cena = obsah * cena_za_m2;
        if (obsah > 1000) {
            cena = cena * 0.85;
        }

        return cena;
    }

    private static String checkPulse(int[] pulses) {
        String info = "";
        for (int i = 0; i < pulses.length - 1; i++) {
            if (pulses[i] == 0) {
                info = "Dead";
                break;
            }
            if (pulses[i] - pulses[i + 1] < -30 || pulses[i + 1] - pulses[i] > 30) {
                info = "Danger";
            } else {
                info = "OK";
            }
        }

        return info;
    }

    public static void main(String[] args) {
//        double[] result = quadraticEquation(1, 2, -3);
//        if (Double.isNaN(result[0])) {
//            System.out.println("Discriminant je zaporny");
//        } else {
//            for (int i = 0; i < result.length; i++) {
//                if (result[i] >= 0) {
//                    System.out.println("X" + (i + 1) + ":  " + result[i]);
//                } else {
//                    System.out.println("X" + (i + 1) + ": " + result[i]);
//                }
//            }
//        }
        int[] arr = {5, 14, 22, 1, 45, 20, 14, 6, 8, 4};
        System.out.println(getMax(arr));
        System.out.println(getMin(arr));

        String time = "10:00";
        System.out.println(timeValue(time));

        int cena_za_metr2 = 10;
        int vyska = 100;
        int sirka = 100;
        System.out.println(cena(cena_za_metr2, vyska, sirka));

        int[] pulses = {40, 45, 105, 10, 1, 15, 20};
        System.out.println(checkPulse(pulses));
    }
}
