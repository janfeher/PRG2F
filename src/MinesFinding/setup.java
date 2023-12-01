package MinesFinding;

public class setup
{
    public static int[][] map = new int[10][10];

    public static void main(String[] args)
    {
        //
        // generate map with mines
        //
        create_map.map();

        draw.update();

        //
        // control the movement
        //
        gameplay.controls();

        //
        // draw the map
        //
        draw.update();
    }
}
