package ru.mirea.task2;

public class TestShape {
    public static void main(String[] args){
        Shape Rectangle = new Shape();
        Rectangle.SetColor("Orange");
        Rectangle.SetNumOfCorners(4);
        System.out.println(Rectangle);
    }
}
