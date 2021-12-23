package ru.mirea.task25;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        ShapeDecorator shapeDecorator = new RedShapeDecorator(circle);
    }
}