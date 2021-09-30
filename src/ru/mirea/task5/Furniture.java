package ru.mirea.task5;

public class Furniture {
    protected String typeOfUpholstery;
    protected String color;
    protected int height;
    protected int width;
    protected int maxUsersWeight;

    public Furniture(String typeOfUpholstery, String color, int height, int width, int maxUsersWeight){
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

    public void setMaxUsersWeight(int maxUsersWeight) {
        this.maxUsersWeight = maxUsersWeight;
    }

    public void setTypeOfUpholstery(String typeOfUpholstery) {
        this.typeOfUpholstery = typeOfUpholstery;
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

    public int getMaxUsersWeight() {
        return maxUsersWeight;
    }

    public String getTypeOfUpholstery() {
        return typeOfUpholstery;
    }
}
