package uvod;

import java.util.Scanner;

public class Cykly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /////////////////////////////////////////////
        // Tahle funkce jenom třídí ostatní funkce //
        /////////////////////////////////////////////
        System.out.print("Vyber si funkci podle zadání 1 - 6: ");
        int vyber = sc.nextInt();
        switch (vyber) {
            case 1 -> soucet();
            case 2 -> faktorial();
            case 3 -> mocnina();
            case 4 -> tipovaci_hra();
            case 5 -> nahodne_cislo();
            case 6 -> tabulka();
        }
    }

    public static void soucet() {
        Scanner sc = new Scanner(System.in);

        int cislo = sc.nextInt();

        int soucet = 0;
        while(cislo != -1) {
            soucet += cislo;
            cislo = sc.nextInt();
        }

        System.out.println("Součet všech čísel je " + soucet);
    }

    public static void faktorial() {
        Scanner sc = new Scanner(System.in);

        int cislo = sc.nextInt();

        int faktorial = 1;
        if (cislo >= 0) { // Nejde spočítat faktorial jako záporné číslo
            for(int i = cislo; i >= 1; i--) {
                faktorial *= i; // Číslo se bude násobit pořád dokola s čísly menšími o 1
            }
        }

        System.out.println("Faktorial z čísla " + cislo + " je " + faktorial);
    }

    public static void mocnina() {
        Scanner sc = new Scanner(System.in);

        int cislo = sc.nextInt();

        int mocnina = sc.nextInt();
        int umocnene_cislo = 1;
        // Umocněné číslo se bude násobit základem mocniny tolikrát, jak velká je mocnina
        for (int i = mocnina; i > 0; i--) {
            umocnene_cislo *= cislo;
        }

        System.out.println("Číslo " + cislo + " umocněné " + mocnina + " je " + umocnene_cislo);
    }

    public static void tipovaci_hra() {
        Scanner sc = new Scanner(System.in);

        int cislo = (int)(Math.random() * 100 + 1);
        int tip = sc.nextInt();

        while (cislo != tip) {
            System.out.println("\nŠpatné číslo");
            System.out.println("---\nNapiš nové číslo:");

            tip = sc.nextInt();

            if (tip < 1) {
                System.out.println("Moc malé číslo");
            } else if (tip > 100) {
                System.out.println("Moc velké číslo");
            }
        }
        System.out.println("Správné číslo");
    }

    public static void nahodne_cislo() {
        int pocet = 0;
        int i;
        for (i = 0; i < 100000; i++) {
            int cislo = (int) (Math.random() * 100 + 1);
            if (cislo == 42) {
                pocet += 1;
            }
        }
        System.out.println("Vygenerovaných čísel je " + i);
        System.out.println("Počet čísel 42: " + pocet);
    }

    public static void tabulka() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Napiš číslo, co bude základ tabulky");
        int cislo = sc.nextInt();
        // Bude psát čísla od 1 do druhé mocniny zadaného čísla
        // Pokud se tam objeví násobek čísla, tak přeskočí na nový řádek pro vytvoření tabuky
        for (int i = 1; i <= (cislo * cislo); i++) {
            System.out.print(i);
            if (i < 10) { // Kosmetická úprava pro zarovnání tabulky
                System.out.print(" ");
            }
            System.out.print(" ");

            if (i % cislo == 0) { // Zjistí, jestli to je násobek čísla
                System.out.print("\n");
            }
        }
    }
}