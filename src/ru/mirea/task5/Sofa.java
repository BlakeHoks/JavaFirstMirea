package ru.mirea.task5;

public class Sofa extends Furniture{
    private boolean foldable;
    private boolean folded;

    public Sofa(String color, int height, int width, boolean foldable) {
        super(color, height, width);
        this.foldable = foldable;
        price = 18000;
    }

    public boolean isFoldable() {
        return foldable;
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
                "foldable=" + foldable +
                ", folded=" + folded +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
