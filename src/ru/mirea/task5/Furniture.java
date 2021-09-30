package ru.mirea.task5;

public class Furniture {
    protected String color;
    protected int height;
    protected int width;
    protected int price;

    public Furniture(String color, int height, int width){
    }

    public int getPrice() {
        return price;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }
}
