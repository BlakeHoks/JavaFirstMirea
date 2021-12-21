package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {

    JTextField numberInput = new JTextField(2);
    JButton guessButton = new JButton("Угадать");
    JLabel guessResult = new JLabel("");
    int ans = 14;
    int tries = 0;

    public Game() {
        setTitle("Task1");
        setPreferredSize(new Dimension(640, 480));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(numberInput);
        c.add(guessButton);
        c.add(guessResult);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Integer.parseInt(numberInput.getText()) == ans){
                    guessResult.setText("Вы выиграли!");
                }
                if (Integer.parseInt(numberInput.getText()) > ans){
                    guessResult.setText("Попробуйте число меньше");
                    tries++;
                }
                if (Integer.parseInt(numberInput.getText()) < ans) {
                    guessResult.setText("Попробуйте число больше");
                    tries++;
                }
                if (tries >= 3){
                    guessResult.setText("Вы не угадали! Загаданное число - " + ans);
                }
            }
        });
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Game();
    }
}