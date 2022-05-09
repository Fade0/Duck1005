package fade.pack;

import javax.swing.*;
import java.awt.*;

public class MainMenuPane extends JPanel {

    public MainMenuPane(){
        Icon buttonImage = new ImageIcon("img\\test4button.png");


        JLabel titleLabel = new JLabel("Duck Shooter!");
        titleLabel.setFont(new Font("montserrat",Font.BOLD,72));
        JButton startButton = new JButton(buttonImage);
        startButton.setBorder(BorderFactory.createEmptyBorder());
        startButton.setContentAreaFilled(false);
        JButton leaderboardsButton = new JButton("leaderboards");
        JButton exitButton = new JButton("Exit");



        setLayout(new GridBagLayout());

        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = gridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(30,0,0,0);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;


        add(titleLabel, gridBagConstraints);
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 0;

        JPanel innerPane = new JPanel();
        innerPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        add(innerPane, gridBagConstraints);

        innerPane.setLayout(new GridBagLayout());

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = gridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(0,0,30,0);
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;


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

}
