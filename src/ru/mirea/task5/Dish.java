package ru.mirea.task5;

public abstract class Dish {
    protected boolean clear;
    protected String color;

    public void Stain(){
        this.clear = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Wash(){
        this.clear = true;
    }

    public boolean isClear(){
        return clear;
    }
}
