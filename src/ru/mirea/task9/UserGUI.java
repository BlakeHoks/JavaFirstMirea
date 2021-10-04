package ru.mirea.task9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class UserGUI extends JFrame {
    JButton buttonLiverpool = new JButton("Liverpool");
    JButton buttonManchester = new JButton("Manchester City");
    JButton buttonFinish = new JButton("Finish");

    private int liverpool=0 , manchester=0;

    JLabel result = new JLabel("Result: "+ liverpool +" X "+ manchester);
    JLabel lastScore = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");


    public UserGUI() {
        super("liverpool vs manchester");
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        setSize(300, 300);

        JPanel gridButton = new JPanel(new GridLayout(1, 2, 5, 0) );
        gridButton.add(buttonLiverpool);
        gridButton.add(buttonManchester);

        JPanel flowButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowButton.add(gridButton);

        JPanel gridInfo = new JPanel(new GridLayout(3,1,5,0));
        gridInfo.add(result);
        gridInfo.add(lastScore);
        gridInfo.add(winner);

        JPanel flowInfo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowInfo.add(gridInfo);

        Container container = getContentPane();
        container.add(flowButton, BorderLayout.SOUTH);
        container.add(flowInfo,BorderLayout.CENTER);
        container.add(buttonFinish,BorderLayout.NORTH);


        buttonLiverpool.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                liverpool++;
                result.setText("Result: "+ liverpool +" X "+ manchester);
                lastScore.setText("Last Scorer: Liverpool");
            }
        });

        buttonManchester.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manchester++;
                result.setText("Result: "+ liverpool +" X "+ manchester);
                lastScore.setText("Last Scorer: Manchester City");
            }
        });

        buttonFinish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flowButton.setVisible(false);
                if (manchester>liverpool) {
                    winner.setText("Winner: Manchester City");
                }
                else if(manchester == liverpool){
                    winner.setText("Winner: DRAW");
                }
                else{
                    winner.setText("Winner: Liverpool");
                }
            }
        });

    }

    public static void main(String[] args) {
        new UserGUI().setVisible(true);
    }
}
