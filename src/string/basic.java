package string;

public class basic
{
    public static void main(String[] args)
    {
        char letter = 'A';
        char num = '5';
        char newline = '\n';
        char tab = '\t';

        System.out.println("hello" + newline + "world");

        int five = Integer.parseInt(String.valueOf(num));
        System.out.println(five);
        System.out.println(num);
        System.out.println(five + 5);
        System.out.println(num + 5);
    }
}
