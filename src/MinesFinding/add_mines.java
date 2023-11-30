package MinesFinding;

public class add_mines extends main
{
    public static void mines()
    {
        int mines = 10;
        int mine_check = 0;

        outer: while (mines >= 0)
        {
            for (int y = 0; y < map.length; y++)
            {
                for (int x = 0; x < map[y].length; x++)
                {
                    if (mine_check == (int) (Math.random() * 10))
                    {
                        map[y][x] = 0;
                        mines--;
                        if (mines == 0)
                        {
                            break outer;
                        }
                    }
                }
            }
        }

        for (int y = 0; y < map.length; y++)
        {
            for (int x = 0; x < map[y].length; x++)
            {
                if (map[y][x] == 0)
                {
                    System.out.print("\u001b[31m" + map[y][x] + "\u001b[0m  ");
                }
                else
                {
                    System.out.print(map[y][x] + "  ");
                }
            }
            System.out.println();
        }
    }
}
