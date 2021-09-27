package ru.mirea.task3;

public class Hand {
    private int palmLength;
    private boolean isBroken;
    private boolean isBent;

    public Hand(int palmLength, boolean isBroken, boolean isBent){
        this.palmLength = palmLength;
        this.isBroken = isBroken;
        this.isBent = isBent;
    }

    public Hand(int palmLength){
        this.palmLength = palmLength;
        this.isBroken = false;
        this.isBent = false;
    }

    public Hand(){
        this.palmLength = 19;
        this.isBroken = false;
        this.isBent = false;
    }

    public int GetFootSize() {
        return palmLength;
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
        return "Hand{" +
                "palmLength=" + palmLength +
                ", isBroken=" + isBroken +
                ", isBent=" + isBent +
                '}';
    }
}
