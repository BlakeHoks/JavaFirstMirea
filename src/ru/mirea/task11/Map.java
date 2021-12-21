package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Map extends JFrame {

    JLabel w = new JLabel("Добро пожаловать на Запад");
    JLabel c = new JLabel("Добро пожаловать в центр");
    JLabel s = new JLabel("Добро пожаловать на Юг");
    JLabel e = new JLabel("Добро пожаловать на Восток");
    JLabel n = new JLabel("Добро пожаловать на Север");

    public Map(){

        setTitle("Task2");
        setPreferredSize(new Dimension(640, 480));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cn = getContentPane();
        cn.setLayout(new BorderLayout());

        w.setHorizontalAlignment(0);
        c.setHorizontalAlignment(0);
        s.setHorizontalAlignment(0);
        e.setHorizontalAlignment(0);
        n.setHorizontalAlignment(0);

        cn.add(BorderLayout.CENTER, c);
        cn.add(BorderLayout.NORTH, n);
        cn.add(BorderLayout.EAST, e);
        cn.add(BorderLayout.WEST, w);
        cn.add(BorderLayout.SOUTH, s);

        c.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Map.this, "<h1>Welcome to Center<h1>");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        s.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Map.this, "<h1>Welcome to South<h1>");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        n.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Map.this, "<h1>Welcome to North<h1>");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        e.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Map.this, "<h1>Welcome to East<h1>");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        w.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Map.this, "<h1>Welcome to West<h1>");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Map();
    }
}