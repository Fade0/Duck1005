package fade.pack;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GameFrame extends JFrame {

    public GameFrame(){
        //ImageIcon backgroundImage = Assets.getBackgroundImage();
        setTitle("Greatest Goose Shooter Ever");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(new Dimension(800,600));
        setResizable(false);
        setLocationRelativeTo(null);

    }


//    public void paintComponent(Graphics graphics){
//        graphics.drawImage(backgroundImage,0,0,this);
//        super.paintComponents(graphics);
//    }
}
