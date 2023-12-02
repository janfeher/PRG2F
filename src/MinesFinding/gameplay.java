package MinesFinding;

import java.util.Scanner;

public class gameplay extends setup
{
    public static Scanner sc = new Scanner(System.in);
    public static int x;
    public static int y;
    public static int flag = 0;
    public static boolean hit = false;

    public static void controls()
    {
        if (hit == false)
        {
            System.out.print("Enter position X (-1 to enter flag mode): ");
            x = sc.nextInt();
            if (x == -1)
            {
                flag();
            }
            System.out.print("Enter position Y: ");
            y = sc.nextInt();

            if (x >= 1 && x <= 10 && y >= 1 && y <= 10)
            {
                if (map[y - 1][x - 1] == 0)
                {
                    map[y - 1][x - 1] = 8;
                    hit();
                } else
                {
                    map[y - 1][x - 1] = 8;
                    draw.update();
                }
            }
        }
    }

    public static void hit()
    {
        hit = true;
        draw.update();
        System.out.println("You hit the bomb!\nGame Over");
    }

    public static int mines = 10;
    public static boolean is_flagged = false;

    public static void flag()
    {
        while (flag < mines)
        {
            is_flagged = true;
            System.out.println("You entered flag mode");

            System.out.println("Enter coordinates to flag (-1 to cancel):");
            System.out.print("X: ");
            x = sc.nextInt();
            if (x == -1)
            {
                is_flagged = false;
                controls();
            }
            System.out.print("Y: ");
            y = sc.nextInt();
            if (x >= 1 && x <= 10 && y >= 1 && y <= 10)
            {
                if (map[y - 1][x - 1] != 4)
                {
                    flag++;
                }
                map[y - 1][x - 1] = 4;
                draw.update();
            }

        }
        System.out.println("You ran out of flags!");
        controls();
    }
}
