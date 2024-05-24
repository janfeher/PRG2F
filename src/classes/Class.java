package classes;

class Country {
    private int population = 0;
    private double area = 0;
    private String name = "";
    private String code = "";

    Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    void get() {
        System.out.println(population);
        System.out.println(area);
        System.out.println(name);
        System.out.println(code);
    }
    void set(int population, String code) {
        if (population > 0) {
            this.population = population;
        }
        if (code.length() == 3) {
            this.code = code;
        }
    }
}

public class Class {
    public static void main(String[] args) {
        Country kantry = new Country("Slovensko", 1_500_000.123);
        kantry.set(10_000_000, "SLO");
        kantry.get();
    }
}
