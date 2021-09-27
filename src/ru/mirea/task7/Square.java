package ru.mirea.task7;

public class Square extends Rectangle{
    public Square(){

    }

    public Square(double side){
        this.width = this.length = side;
    }

    public Square(double side, String color, boolean filled){
        this.width = this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        this.width = this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = this.length = side;
    }

    @Override
    public String toString() {
        return "Color is " + color + " and it's filled(" + filled + ")" + "\nSquare's side is " + width;
    }
}
