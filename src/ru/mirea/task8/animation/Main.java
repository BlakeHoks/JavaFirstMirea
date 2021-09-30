package ru.mirea.task8.animation;

import javax.swing.*;

public class Main extends Animation{
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/0.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/1.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/2.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/3.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/4.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/5.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/6.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/7.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/8.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/9.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/10.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/11.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/12.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/13.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/14.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/15.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/16.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/17.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/18.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/19.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/20.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/21.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/22.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/23.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/manime/24.gif").getImage());
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
