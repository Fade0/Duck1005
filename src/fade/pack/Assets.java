package fade.pack;

import javax.swing.*;
import java.util.MissingResourceException;

public class Assets{

    private static ImageIcon startButton;
    private static ImageIcon leaderboardButton;
    private static ImageIcon exitButton;
    private static ImageIcon titleImage;
    private static ImageIcon gooseGifImage;
    private static ImageIcon backgroundImage;

    public Assets(){

        loadGraphics();

    }

    void loadGraphics(){

        try{
            startButton = new ImageIcon("resources/img/newGameButton.png");
            leaderboardButton = new ImageIcon("resources/img/leaderboardButton.png");
            exitButton = new ImageIcon("resources/img/exitButton.png");
            titleImage = new ImageIcon("resources/img/titleButton.png");
            gooseGifImage = new ImageIcon("resources/img/goose.gif");
            backgroundImage = new ImageIcon("resources/img/background");


        }
        catch (MissingResourceException exception){
            System.out.println("Failed to load graphics");
        }


    }

    public static ImageIcon getStartButton() {
        return startButton;
    }

    public static ImageIcon getLeaderboardButton() {
        return leaderboardButton;
    }

    public static ImageIcon getExitButton() {
        return exitButton;
    }

    public static ImageIcon getTitleImage() {
        return titleImage;
    }

    public static ImageIcon getBackgroundImage() {
        return backgroundImage;
    }

    public static ImageIcon getGooseGifImage() {
        return gooseGifImage;
    }
}
