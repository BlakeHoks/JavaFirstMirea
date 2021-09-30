package ru.mirea.task5;

public class Armchair extends Furniture{
    private String typeOfArmchair;

    public Armchair(String typeOfUpholstery, String color, int height, int width, int maxUsersWeight, String typeOfArmchair){
        super(typeOfUpholstery, color, height, width, maxUsersWeight);
        this.typeOfArmchair = typeOfArmchair;
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
                ", typeOfUpholstery='" + typeOfUpholstery + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", maxUsersWeight=" + maxUsersWeight +
                '}';
    }
}
