package ru.mirea.task5;

public class Pan extends Dish{
    private int diameter;
    private String coverage;
    private boolean friedFood;

    public boolean isFriedFood() {
        return friedFood;
    }

    public void PutOutTheFood(){
        this.friedFood = false;
    }

    public Pan(int diameter, String coverage, String color){
        this.diameter = diameter;
        this.coverage = coverage;
        this.color = color;
        this.clear = true;
        this.friedFood = false;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getCoverage() {
        return coverage;
    }

    public void Fry(){
        this.friedFood = true;
        this.clear = false;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "diameter=" + diameter +
                ", coverage='" + coverage + '\'' +
                ", friedFood=" + friedFood +
                '}';
    }
}
