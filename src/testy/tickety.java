package testy;

public class tickety
{
    public static void main(String[] args)
    {
        int ticket;
        int hodnota = 0;
        int pocet = 0;
        System.out.print("\nHodnoty ticketu: ");
        while(hodnota < 1000)
        {
            ticket = (int)(Math.random() * 100 + 1);
            System.out.print(ticket + " ");
            hodnota += ticket;
            pocet++;
        }
        System.out.println("\nBylo potreba " + pocet + " ticketu");
    }
}
