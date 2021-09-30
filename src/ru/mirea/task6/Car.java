package ru.mirea.task6;

public class Car implements Nameable, Priceable {
    private String model;
    private int price;

    public Car(String model,int price){
        this.model = model;
        this.price = price;
    }

    public Car(){
        this.model = "Lada";
        this.price = 200000;
    }

    @Override
    public String getName() {
        return model;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
