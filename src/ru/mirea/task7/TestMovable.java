package ru.mirea.task7;

public class TestMovable {
    public static void main(String[] args){
        MovableCircle circle = new MovableCircle(4,1,0,0,4);
        circle.moveLeft();
        circle.moveUp();
        System.out.println(circle.toString());
        MovableRectangle rectangle = new MovableRectangle(0,0,3,5,0,0);
        rectangle.moveRigth();
        rectangle.moveDown();
        System.out.println(rectangle.toString());
    }
}
