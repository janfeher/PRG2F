package MinesFinding;

import java.util.Scanner;

public class gameplay extends setup
{
    public static Scanner sc = new Scanner(System.in);
    public static int x;
    public static int y;

    public static void controls()
    {
        System.out.print("Enter position X: ");
        x = sc.nextInt();
        System.out.print("Enter position Y: ");
        y = sc.nextInt();

        if (x >= 1 && x <= 10 && y >= 1 && y <= 10)
        {
            if (map[y - 1][x - 1] == 0)
            {
                map[y - 1][x - 1] = 8;
                System.out.println("bum");
            } else
            {
                map[y - 1][x - 1] = 8;
            }
        } else if (x == -1)
        {
            flag();
        }
    }

    public static void flag()
    {
        System.out.println("You entered flag mode");

        System.out.println("Enter coordinates to flag:");
        System.out.print("X: ");
        x = sc.nextInt();
        System.out.print("Y: ");
        y = sc.nextInt();
        map[y - 1][x - 1] = 4;
    }
}
