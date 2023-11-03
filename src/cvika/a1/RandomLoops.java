package cvika.a1;

public class RandomLoops {

    public static void main(String[] args) {
        //kolik pokusu trva, nez padnou 2 stejna cisla, kdyz jsou nahodna
        // a kdyz jsou od 0 - 20
        int num1 = (int)(Math.random()*21);
        int num2 = (int)(Math.random()*21);
        int tries = 1;
        System.out.println(num1 + ", " + num2);
        while (num1 != num2){
            num1 = (int)(Math.random()*21);
            num2 = (int)(Math.random()*21);
            tries++;//tries = tries + 1;
            System.out.println(num1 + ", " + num2);
        }
        System.out.println("Pokusu celkem:" + tries);

        //vygeneruj 100x 2 nahodna cisla, vypis, kolikrat padlo stejne
        System.out.println("---------");
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            num1 = (int)(Math.random()*21);
            num2 = (int)(Math.random()*21);
            System.out.println(num1 + ", " + num2);
            if (num2 == num1){
                counter++;
            }
        }
        System.out.println("Stejna cisla padla " + counter + "x");
    }
}
