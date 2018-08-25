package codekamp;

import javax.swing.*;

public
class Game {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        GamePanel panel = new GamePanel();

        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
