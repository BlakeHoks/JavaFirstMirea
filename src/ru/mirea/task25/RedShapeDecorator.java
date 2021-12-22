package ru.mirea.task25;

public class RedShapeDecorator extends ShapeDecorator{

    private void setRedBorder(){
        System.out.println("Вы сделали границу красного цвета");
    }

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw(){
        setRedBorder();
    }
}