import java.awt.*;
import javax.swing.*;

/**
 * Created by Evan on 11/21/2015.
 */
public class Main extends JPanel
{
    public static Engine engine;

    public static void main(String[] args)
    {
        JFrame f = new JFrame("Game");
        f.add(engine);
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g)
    {
		if(engine == null)
			engine = new Engine(g);
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
    }
}
