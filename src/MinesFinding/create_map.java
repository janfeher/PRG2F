package MinesFinding;

public class create_map extends main
{
    public static void map()
    {
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
    }
}
