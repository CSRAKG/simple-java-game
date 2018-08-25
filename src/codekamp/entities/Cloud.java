package codekamp.entities;

import codekamp.Resources;

public
class Cloud extends Entity {
    public Cloud(int x, int y) {
        super();

        this.x = x;
        this.y = y;
        this.xVel = -3;
        this.image = Resources.cloudImage;
    }
}
