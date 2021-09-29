package ru.mirea.task5;

public class Cup extends Dish{
    private int maxVolume;
    private int curVolume;
    private String typeOfDrink;
    private boolean full;

    public Cup(int maxVolume, int curVolume, String typeOfDrink, String color){
        this.maxVolume = maxVolume;
        this.curVolume = curVolume;
        this.typeOfDrink = typeOfDrink;
        this.color = color;
        if (curVolume >= maxVolume) {
            this.full = true;
            this.curVolume = maxVolume;
        }
        this.clear = curVolume == 0;
    }

    public int getCurVolume() {
        return curVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public String getTypeOfDrink() {
        return typeOfDrink;
    }

    public boolean isFull() {
        return full;
    }

    public void setTypeOfDrink(String typeOfDrink) {
        this.typeOfDrink = typeOfDrink;
    }

    public void Pour(int volume){
        this.curVolume -= volume;
        if (this.curVolume < 0){
            this.curVolume = 0;
        }
    }

    public void Fill(int volume){
        this.curVolume += volume;
        if (volume >= this.maxVolume){
            this.full = true;
        }
    }

    @Override
    public String toString() {
        return "Cup{" +
                "maxVolume=" + maxVolume +
                ", curVolume=" + curVolume +
                ", typeOfDrink='" + typeOfDrink + '\'' +
                ", full=" + full +
                '}';
    }
}
