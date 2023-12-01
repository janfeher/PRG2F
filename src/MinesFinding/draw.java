package MinesFinding;

public class draw extends setup
{
    public static int mines_counter;

    public static void update()
    {
        mines_counter = 0;
        //
        // output the finished map
        //
        for (int y = 0; y < map.length; y++)
        {
            for (int x = 0; x < map[y].length; x++)
            {
                if (map[y][x] == 0)
                {
                    System.out.print("\u001b[21m\u001b[31m" + map[y][x] + "\u001b[0m  ");
                    mines_counter++;
                } else if (map[y][x] == 8)
                {
                    System.out.print("\u001b[42m" + map[y][x] + "\u001b[0m  ");
                } else
                {
                    System.out.print("\u001b[90m" + map[y][x] + "\u001b[0m  ");
                }
            }
            System.out.println();
        }
        System.out.println("Mines: " + mines_counter);
    }
}
