package codekamp.entities;
import codekamp.Resources;
/**
 * Created by cerebro on 25/09/17.
 */
public class Player extends Entity
{

    public Player(int x, int y) {
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
