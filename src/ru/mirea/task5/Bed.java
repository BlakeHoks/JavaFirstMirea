package ru.mirea.task5;

public class Bed extends Furniture{
    private int length;

    public Bed(String color, int height, int width, int length){
        super(color, height, width);
        this.length = length;
        price = 23000;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "length=" + length +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price +
                '}';
    }
}
