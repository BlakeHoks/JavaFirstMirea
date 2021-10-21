package ru.mirea.task14;

import java.util.LinkedList;
import java.util.Queue;

public class Game2 {
    private Queue player1 = new LinkedList();
    private Queue player2 = new LinkedList();
    private int numOfMoves = 0;

    public Game2(String s1, String s2){
        for (int i = 0; i < s1.length(); i++){
            player1.add(Integer.valueOf(String.valueOf(s1.charAt(i))));
            player1.add(Integer.valueOf(String.valueOf(s2.charAt(i))));
        }
    }
}
