package codekamp.entities;

import codekamp.Resources;

public
class Block extends Entity {
    public
    Block(int x, int y) {
        super();// use of super here

        this.x = x;
        this.y = y;
        this.xVel = -5;
        this.image = Resources.blockImage;
    }

}