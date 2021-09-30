package ru.mirea.task5;

public class Armchair extends Furniture{
    private String typeOfArmchair;

    public Armchair(String color, int height, int width, String typeOfArmchair){
        super(color, height, width);
        this.typeOfArmchair = typeOfArmchair;
        price = 12000;
    }

    public String getTypeOfArmchair() {
        return typeOfArmchair;
    }

    public void setTypeOfArmchair(String typeOfArmchair) {
        this.typeOfArmchair = typeOfArmchair;
    }

    @Override
    public String toString() {
        return "Armchair{" +
                "typeOfArmchair='" + typeOfArmchair + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
