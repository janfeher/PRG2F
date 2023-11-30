package MinesFinding;

public class setup
{
    public static int[][] map = new int[10][10];

    public static void main(String[] args)
    {
        create_map.map();
        add_mines.mines();
    }
}
