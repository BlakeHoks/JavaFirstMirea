package ru.mirea.task5;

import java.util.Arrays;

public class FurnitureShop {
    private Furniture armchair = new Armchair("Brown", 140,80, "Office armchair");
    private Sofa sofa = new Sofa("Yellow", 70, 190, true);
    private Bed bed = new Bed("White", 60, 180, 200);
    private int numOfArmchairs;
    private int numOfSofas;
    private int numOfBeds;

    public void setNumOfArmchairs(int numOfArmchairs) {
        this.numOfArmchairs = numOfArmchairs;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public void setNumOfSofas(int numOfSofas) {
        this.numOfSofas = numOfSofas;
    }

    public int getNumOfArmchairs() {
        return numOfArmchairs;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public int getNumOfSofas() {
        return numOfSofas;
    }

    public void AddArmchairs(int amount){
        numOfArmchairs += amount;
    }

    public void AddBeds(int amount){
        numOfBeds += amount;
    }

    public void AddSofas(int amount){
        numOfSofas += amount;
    }

    public void BuyArmchair(int money){
        if (numOfArmchairs > 0) {
            if (money >= armchair.getPrice()) {
                numOfArmchairs -= 1;
                System.out.println("Congratulations, you have successfully bought a great armchair for your house");
                System.out.println("Your change is " + (money - armchair.getPrice()));
            } else {
                System.out.println("Sorry, but you don't have enough money");
            }
        }else {
            System.out.println("Sorry, but our stocks of the armchairs are empty");
        }
    }

    public void BuyBed(int money){
        if (numOfBeds > 0) {
            if (money >= bed.getPrice()) {
                numOfBeds -= 1;
                System.out.println("Congratulations, you have successfully bought a great bed for your house");
                System.out.println("Your change is " + (money - bed.getPrice()));
            } else {
                System.out.println("Sorry, but you don't have enough money");
            }
        }else {
            System.out.println("Sorry, but our stocks of the beds are empty");
        }
    }

    public void BuySofa(int money){
        if (numOfSofas > 0) {
            if (money >= sofa.getPrice()) {
                numOfSofas -= 1;
                System.out.println("Congratulations, you have successfully bought a great sofa for your house");
                System.out.println("Your change is " + (money - sofa.getPrice()));
            } else {
                System.out.println("Sorry, but you don't have enough money");
            }
        } else {
            System.out.println("Sorry, but our stocks of the sofas are empty");
        }
    }

    public void getArmchairPrice(){
        System.out.println("The armchair price is " + armchair.getPrice());
    }

    public void getBedPrice(){
        System.out.println("The bed price is " + bed.getPrice());
    }

    public void getSofaPrice(){
        System.out.println("The sofa price is " + sofa.getPrice());
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "\nnumOfArmchairs=" + numOfArmchairs +
                "\nnumOfSofas=" + numOfSofas +
                "\nnumOfBeds=" + numOfBeds +
                "\n}";
    }
}
