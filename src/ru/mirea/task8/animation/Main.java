package ru.mirea.task8.animation;

import javax.swing.*;

public class Main extends Animation{
    public static void main(String[] args) {
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/0.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/1.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/2.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/3.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/4.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/5.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/6.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/7.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/8.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/9.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/10.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/11.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/12.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/13.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/14.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/15.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/16.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/17.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/18.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/19.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/20.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/21.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/22.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/23.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/24.gif").getImage());
        Animation animImg = new Animation();
        while (true) {
            for (int i = 0; i < 25; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(38);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
