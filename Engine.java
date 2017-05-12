import java.awt.*;
import javax.swing.*;

/**
 * Created by Ugff on 11/21/2015.
 */
public class Engine extends JPanel
{
    private static char[][] screen; // change to graphics soon
    private static char[][] preScreen;

    public static Graphics g;

    private static int ROW = 23;
    private static int COL = 80;

    public Engine(Graphics gr)
    {
        g = gr;

        screen = new char[ROW][COL];
        preScreen = new char[ROW][COL];
        initScreen();
    }

    public static void initScreen()
    {
        for(int i = 0; i < ROW; i++)
            for(int j = 0; j < COL; j++)
                screen[i][j] = ' ';
        preScreen = screen;
    }

    public static void clearScreen()
    {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 600, 600);
    }

    public static void drawScreen()
    {
        clearScreen();
        for(int i = 0; i < ROW; i++){ // draw
            for (int j = 0; j < COL; j++){
                System.out.print(screen[i][j]);
            }
            System.out.println();
        }
    }

    public static void charXY(char c, int x, int y)
    {
        screen[x][y] = c;
    }

    public static void stringXY(String str, int x, int y)
    {
        // loop through string and put characters on array
        for(int i = 0; str.length() != 0; i++){
            if(i >= COL){
                i = 0;
                x++;
            } else if(y+i >= COL){
                y = 0;
                x++;
            }
            screen[x][y+i] = str.charAt(0);
            str = str.substring(1);
        }
    }

    public static void gameUpdate() // update screen and engine things
    {
        if(preScreen != screen){
            drawScreen();
            preScreen = screen;
        }
        // other engine related things on a update basis
    }
}
