package codekamp;

import codekamp.screens.Screen;
import codekamp.screens.WelcomeScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 * Created by cerebro on 20/09/17.
 */
public class GamePanel extends JPanel implements KeyListener, Runnable,MouseListener{


    public static Screen currentScreen;


    public GamePanel() {
        this.setPreferredSize(new Dimension(800, 450));
        this.setFocusable(true);
        this.addKeyListener(this);
    }

    @Override
    public void addNotify() {
        super.addNotify();
        Resources.load();

        GamePanel.currentScreen = new WelcomeScreen();

        Thread t = new Thread(this);
        t.setName("my awesome thread");
        t.start();
    }

    @Override

    public void keyTyped(KeyEvent e) {
        //do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        GamePanel.currentScreen.onKeyPress(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        GamePanel.currentScreen.onKeyRelease(e.getKeyCode());
    }
  @Override
    public
    void mouseClicked(MouseEvent e) {

    }

    @Override
    public
    void mousePressed(MouseEvent e) {

    }

    @Override
    public
    void mouseReleased(MouseEvent e) {

    }

    @Override
    public
    void mouseEntered(MouseEvent e) {

    }

    @Override
    public
    void mouseExited(MouseEvent e) {

    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            GamePanel.currentScreen.update();

            Graphics g = this.getGraphics();
            g.clearRect(0, 0, 800, 450);
            GamePanel.currentScreen.render(g);
            g.dispose();
        }
    }

}
