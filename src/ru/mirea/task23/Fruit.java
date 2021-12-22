package ru.mirea.task23;

public class Fruit {
    private String Name;
    private double weight;

    Fruit(){
        this.Name = "test";
        this.weight = 0.3;
    }
    Fruit(String name, double account){
        this.Name = name;
        this.weight = account;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return this.weight;
    }
}
