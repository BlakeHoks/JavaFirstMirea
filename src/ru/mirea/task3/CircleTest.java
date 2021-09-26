package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args){
        Circle A = new Circle();
        System.out.println("Color = " + A.GetColor());
        A.SetColor("cyan");
        System.out.println("Color = " + A.GetColor());
        A.SetRadius(82);
        A.SetThickness(3.459);
        System.out.println("Radius = " + A.GetRadius());
        System.out.println("Thickness = " + A.GetThickness());
    }
}
