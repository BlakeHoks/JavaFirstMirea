package ru.mirea.task5;

public class SoupPlate extends Dish{
    private boolean full;
    private int maxVolume;
    private int volume;

    public SoupPlate(int maxVolume, int volume, String color){
        this.maxVolume = maxVolume;
        this.volume = volume;
        this.color = color;
        if (volume >= maxVolume) {
            this.full = true;
            this.volume = maxVolume;
        }
        this.clear = volume == 0;
    }
    public SoupPlate(int maxVolume){
        this.maxVolume = maxVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public boolean isFull() {
        return full;
    }

    public void Pour(int volume){
        this.volume -= volume;
        if (this.volume < 0){
            this.volume = 0;
        }
    }

    public void Fill(int volume){
        this.volume += volume;
        if (volume >= this.maxVolume){
            this.full = true;
        }
    }

    public int getVolume(){
        return volume;
    }

    @Override
    public String toString() {
        return "SoupPlate{" +
                "full=" + full +
                ", maxVolume=" + maxVolume +
                ", volume=" + volume +
                '}';
    }
}
