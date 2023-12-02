package MinesFinding;

public class create_map extends setup
{
    public static void map()
    {
        //
        // create blank map
        //
        System. out. print("\033[H\033[2J");
        System. out. flush();
        for (int y = 0; y < map.length; y++)
        {
            for (int x = 0; x < map[y].length; x++)
            {
                map[y][x] = 1;
                System.out.print(map[y][x] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        mines();
    }

    //
    // go down by rows and generate mines
    //
    public static void mines()
    {
        int mines = 10;
        int mine_check = 0;

        outer:
        while (mines >= 0)
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
    }
}
