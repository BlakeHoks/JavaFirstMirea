package ru.mirea.task3;

public class Circle {
    private double radius = 1;
    private double thickness = 1;
    String color = "black";
    public double GetRadius(){
        return radius;
    }
    public void SetRadius(double radius){
        this.radius = radius;
    }
    public double GetThickness(){
        return thickness;
    }
    public void SetThickness(double thickness){
        this.thickness = thickness;
    }
    public String GetColor(){
        return color;
    }
    public void SetColor(String color){
        this.color = color;
    }
}
