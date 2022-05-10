package fade.pack;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        new Assets();


        SwingUtilities.invokeLater(()->{
            MainMenuPane mainMenuPane = new MainMenuPane();
            GameFrame gameFrame = new GameFrame();
            gameFrame.add(mainMenuPane);


        } );
    }
}
