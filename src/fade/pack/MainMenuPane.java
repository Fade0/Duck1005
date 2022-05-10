package fade.pack;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MainMenuPane extends JPanel {

    public MainMenuPane(){
        //Importing Images
        ImageIcon startButtonImage = Assets.getStartButton();
        ImageIcon leaderboardButtonImage = Assets.getLeaderboardButton();
        ImageIcon exitButtonImage = Assets.getExitButton();
        ImageIcon titleImage = Assets.getTitleImage();
        ImageIcon backgroundImage = Assets.getBackgroundImage();

        //Button - Title
        JButton titleButton = new JButton(titleImage);
        titleButton.setBorder(BorderFactory.createEmptyBorder());
        titleButton.setContentAreaFilled(false);

        //Button - Start
        JButton startButton = new JButton(startButtonImage);
        startButton.setBorder(BorderFactory.createEmptyBorder());
        startButton.setContentAreaFilled(false);
        //TextOverButton
        startButton.setHorizontalTextPosition(JButton.CENTER);
        startButton.setVerticalTextPosition(JButton.CENTER);

        //Button - Leaderboard
        JButton leaderboardsButton = new JButton(leaderboardButtonImage);
        leaderboardsButton.setBorder(BorderFactory.createEmptyBorder());
        leaderboardsButton.setContentAreaFilled(false);

        //Button - Exit
        JButton exitButton = new JButton(exitButtonImage);
        exitButton.setBorder(BorderFactory.createEmptyBorder());
        exitButton.setContentAreaFilled(false);


        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = gridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(0,0,0,0);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;

        //add(backgroundImage,gridBagConstraints);
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 0;

       add(titleButton, gridBagConstraints);
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 0;




        JPanel innerPane = new JPanel();
        innerPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        add(innerPane, gridBagConstraints);
        innerPane.setLayout(new GridBagLayout());

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = gridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(0,0,0,0);
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;


        //AddingButtons
        //StartButton
        innerPane.add(startButton, gridBagConstraints);
        gridBagConstraints.gridy = 1;
        //leaderboardsButton
        innerPane.add(leaderboardsButton, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new Insets(0,0,0,0);
        //ExitButton
        innerPane.add(exitButton, gridBagConstraints);
        gridBagConstraints.gridy = 3;


        //ActionListeners
        titleButton.addActionListener(e -> {
            System.out.println("Honk! \nHonk!");
            soundclick();
            System.out.print("                                   ___\n" +
                    "                               ,-\"\"   `.\n" +
                    "                             ,'  _   e )`-._\n" +
                    "                            /  ,' `-._<.===-'\n" +
                    "                           /  /\n" +
                    "                          /  ;\n" +
                    "              _          /   ;\n" +
                    " (`._    _.-\"\" \"\"--..__,'    |\n" +
                    " <_  `-\"\"                     \\\n" +
                    "  <`-                          :\n" +
                    "   (__   <__.                  ;\n" +
                    "     `-.   '-.__.      _.'    /\n" +
                    "        \\      `-.__,-'    _,'\n" +
                    "         `._    ,    /__,-'\n" +
                    "            \"\"._\\__,'< <____\n" +
                    "                 | |  `----.`.\n" +
                    "                 | |        \\ `.\n" +
                    "                 ; |___      \\-``\n" +
                    "                 \\   --<\n" +
                    "                  `.`.<\n" +
                    "             hjw    `-'\n");
            System.out.println("Honk! \nHonk!");
        });

        startButton.addActionListener(e -> {
            System.out.println("Start");
        });

        leaderboardsButton.addActionListener(e -> {
            System.out.println("leaderboards");
        });

        exitButton.addActionListener(e -> {
            System.exit(0);
        });
    }

    public void soundclick(){
        try{
            File s = new File("resources/audio/honk1s.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(s));
            c.start();
        }
        catch (Exception e ){
            e.printStackTrace();
        }

    }
}
