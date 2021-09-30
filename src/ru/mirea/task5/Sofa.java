package ru.mirea.task5;

public class Sofa extends Furniture{
    private int numOfSeats;
    private boolean foldable;
    private boolean folded;

    public Sofa(String typeOfUpholstery, String color, int height, int width, int maxUsersWeight, int numOfSeats, boolean foldable) {
        super(typeOfUpholstery, color, height, width, maxUsersWeight);
        this.numOfSeats = numOfSeats;
        this.foldable = foldable;
    }

    public boolean isFoldable() {
        return foldable;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public void UnFold(){
        this.folded = false;
    }

    public void Fold(){
        this.folded = true;
    }

    public boolean isFolded() {
        return folded;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "typeOfUpholstery='" + typeOfUpholstery + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", maxUsersWeight=" + maxUsersWeight +
                ", numOfSeats=" + numOfSeats +
                ", foldable=" + foldable +
                ", folded=" + folded +
                '}';
    }
}
