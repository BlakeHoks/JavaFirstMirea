package ru.mirea.task5;

public class Bed extends Furniture{
    private int length;

    public Bed(String typeOfUpholstery, String color, int height, int width, int maxUsersWeight, int length){
        super(typeOfUpholstery, color, height, width, maxUsersWeight);
        this.length = length;
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
                ", typeOfUpholstery='" + typeOfUpholstery + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", maxUsersWeight=" + maxUsersWeight +
                '}';
    }
}
