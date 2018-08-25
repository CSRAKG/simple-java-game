package codekamp.screens;

import codekamp.RandomGen;
import codekamp.Resources;
import codekamp.entities.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;

/**
 Created by cerebro on 20/09/17.
 **/
public class StageOneScreen extends Screen {

    private java.util.List<Block> blocks = new ArrayList<>();
    private java.util.List<Cloud> clouds = new ArrayList<>();
    private java.util.List<Welcome> welcomes = new ArrayList<>();
    private java.util.List<Enemy> enemies = new ArrayList<>();

    public StageOneScreen() {
        this.blocks.add(new Block(900, randomBlockYCord()));
        this.blocks.add(new Block(1100, randomBlockYCord()));
        this.blocks.add(new Block(1300, randomBlockYCord()));
        this.blocks.add(new Block(1500, randomBlockYCord()));
        this.blocks.add(new Block(1700, randomBlockYCord()));

        this.clouds.add(new Cloud(0, randomCloudYCord()));
        this.clouds.add(new Cloud(0, randomCloudYCord()));
        this.welcomes.add(new Welcome(0, randomCloudYCord()));

      //  this.clouds.add(new Welcome(0, randomCloudYCord()));


        this.entities.addAll(this.blocks);
        this.entities.addAll(this.clouds);
        this.entities.add(new Player(400, 315));

        //this.entities.add(new Player(600, 315));
        Resources.wav.play();
    }

    @Override
    public void update() {
        super.update();

        for(Block b: this.blocks) {
            if(b.x < 20) {
                b.x = 980;
                b.y = randomBlockYCord();
            }
        }


      for(Cloud c: this.clouds) {
            if(c.x < -128) {
                c.x = -127;
                c.y = randomCloudYCord();
            }
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.welcomeImage, 0, 0, null);


        //draw all non entities
        //g.setColor(Resources.skyColor);
        //g.fillRect(0, 0, 800, 450);
        //g.drawImage(Resources.grassImage, 0, 405, null);

        //draw all entities
        super.render(g);
    }

    private int randomBlockYCord() {
        if (RandomGen.nextInt(2) == 0) {
            return -300;
        } else {
            return 300;
        }
    }

    private int randomCloudYCord() {
        if (RandomGen.nextInt(2) == 0) {
            return -200;
        } else {
            return -205;
        }
    }

    @Override
    public void onKeyPress(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE) {
            this.entities.get(7).yVel = -30;
              this.entities.get(7).yAcc = 1;
        } else if(keyCode == KeyEvent.VK_ENTER) {
            this.entities.get(7).yVel = +30;
            this.entities.get(7).yAcc = -1;
        }

    }
}
