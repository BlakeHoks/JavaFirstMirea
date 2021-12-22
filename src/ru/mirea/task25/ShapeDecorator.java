package ru.mirea.task25;

public class ShapeDecorator implements Shape{
    Shape shape;

    public void draw(){
        shape.draw();
        System.out.println("Вы задали параметры");
    }

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
}