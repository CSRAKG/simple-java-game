package codekamp.entities;

import codekamp.Resources;

public
class Enemy extends Entity {
    public
    Enemy(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        //   this.height = 90;
        //   this.width = 72;
    }

    @Override
    public void update() {
        super.update();
        this.image = Resources.playerImage;
    }
}