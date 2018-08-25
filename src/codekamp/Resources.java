package codekamp;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public
class Resources {
    public static Image standImage;
    public static Image controlimage;
    public static Image groundImage;
    public static Image welcomeImage;
    public static Image blockImage;
    public static Image logImage;
    public static Image planktopImage;
    public static Image plankmoidImage;
    public static Image planklowImage;
    public static Image cloudImage;
    public static Image forkImage;
   public static Image playerImage ;
    public static AudioClip wav;

public static Image angryImage;
    //  public static Color skyColor = new Color(208, 244, 247);


    public static void load() {
        try {
            Resources.controlimage = ImageIO.read(Resources.class.getResource("images\\controls.png"));
            Resources.blockImage = ImageIO.read(Resources.class.getResource("images\\branch.png"));
            Resources.groundImage = ImageIO.read(Resources.class.getResource("images\\ground.png"));
            Resources.welcomeImage = ImageIO.read(Resources.class.getResource("images\\back_trees.png"));
            Resources.logImage = ImageIO.read(Resources.class.getResource("images\\log.png"));
            Resources.standImage = ImageIO.read(Resources.class.getResource("images\\stand.png"));
            Resources.planktopImage = ImageIO.read(Resources.class.getResource("images\\plank_top.png"));
            Resources.plankmoidImage = ImageIO.read(Resources.class.getResource("images\\plank_mid.png"));
            Resources.planklowImage = ImageIO.read(Resources.class.getResource("images\\plank_bot.png"));
            Resources.cloudImage = ImageIO.read(Resources.class.getResource("images\\clouds.png"));
          //  Resources.playerImage=  ImageIO.read(Resources.class.getResource("images\\pappu.png"));
             //Resources.playerImages = (java.util.List <Image>) ImageIO.read(Resources.class.getResource("images\happy_pakia.png"));
            Resources.playerImage=ImageIO.read(Resources.class.getResource("images\\happy_pakia.png"));
            Resources.forkImage = ImageIO.read(Resources.class.getResource("images\\fork_handle.png"));
           Resources.wav= Applet.newAudioClip(Resources.class.getResource("sounds\\pappu-pakia2.3.ogg"));
Resources.angryImage=ImageIO.read(Resources.class.getResource("images\\angry_pakia.png"));
                // Resources.playerImages.add(ImageIO.read(Resources.class.getResource("images/run_anim1.png")));
          //  Resources.playerImages.add(ImageIO.read(Resources.class.getResource("images/run_anim2.png")));
            //Resources.playerImages.add(ImageIO.read(Resources.class.getResource("images/run_anim3.png")));
            //Resources.playerImages.add(ImageIO.read(Resources.class.getResource("images/run_anim4.png")));
            //Resources.playerImages.add(ImageIO.read(Resources.class.getResource("images/run_anim5.png")));
       //     Resources.playerImages.add(Resources.playerImages.get(10));
      //      Resources.playerImages.add(Resources.playerImages.get(11));
           // Resources.playerImages.add(Resources.playerImages.get(1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
