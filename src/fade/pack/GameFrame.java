package fade.pack;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(new Dimension(800,600));
        setResizable(false);
        setLocationRelativeTo(null);

    }
}
