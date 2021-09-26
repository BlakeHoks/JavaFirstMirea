package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args){
        Ball B = new Ball(5, 5);
        System.out.println(B);
        B.move(-1, 5);
        System.out.println(B);
    }
}
