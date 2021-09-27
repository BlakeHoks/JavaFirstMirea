package ru.mirea.task3;

public class Leg {
    private int footSize;
    private boolean isBroken;
    private boolean isBent;

    public Leg(int footSize, boolean isBroken, boolean isBent){
        this.footSize = footSize;
        this.isBroken = isBroken;
        this.isBent = isBent;
    }

    public Leg(int footSize){
        this.footSize = footSize;
        this.isBroken = false;
        this.isBent = false;
    }

    public Leg(){
        this.footSize = 40;
        this.isBroken = false;
        this.isBent = false;
    }

    public int GetFootSize() {
        return footSize;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void Break(){
        this.isBroken = true;
    }

    public void CureFracture(){
        this.isBroken = false;
    }

    public boolean IsBent() {
        return isBent;
    }

    public void Bent(){
        this.isBent = true;
    }

    public void Straighten(){
        this.isBent = false;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "footSize=" + footSize +
                ", isBroken=" + isBroken +
                ", isBent=" + isBent +
                '}';
    }
}
