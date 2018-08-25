package codekamp.screens;

import codekamp.GamePanel;
import codekamp.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;

public
class WelcomeScreen extends Screen{

    @Override
    public void render(Graphics g) {
        //draw non entities
        g.drawImage(Resources.welcomeImage, 0, 0, null);
        g.drawImage(Resources.groundImage, 0, 0, null);
        g.drawImage(Resources.controlimage, 300, 200, null);
        g.drawImage(Resources.logImage, 0, 350, null);
        g.drawImage(Resources.standImage, 700, 100, null);
        g.drawImage(Resources.planklowImage, 600, 150, null);
        g.drawImage(Resources.plankmoidImage, 600, 250, null);
        g.drawImage(Resources.planktopImage, 600, 350, null);
        g.drawString("CHANDRAM RATHORE", 100, 100);
        //draw entities
        super.render(g);
    }
    @Override
    public void onKeyPress(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE) {
            GamePanel.currentScreen = new StageOneScreen();
        }

    }
}
