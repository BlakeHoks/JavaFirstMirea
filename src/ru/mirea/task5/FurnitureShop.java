package ru.mirea.task5;

import java.util.Arrays;

public class FurnitureShop {
    public Furniture[] armchairs = new Armchair[10];
    public Sofa[] sofas = new Sofa[10];
    public Bed[] beds = new Bed[10];
    private int numOfArmchairs = 0;
    private int numOfSofas = 0;
    private int numOfBeds = 0;

    public void AddArmchair(String typeOfUpholstery, String color, int height, int width, int maxUsersWeight, String typeOfArmchair){
        if (numOfArmchairs == 9){
            System.out.println("The warehouse is full");
        } else {
            armchairs[numOfArmchairs] = new Armchair(typeOfUpholstery, color, height, width, maxUsersWeight, typeOfArmchair);
            numOfArmchairs += 1;
        }
    }

    public void AddSofa(String typeOfUpholstery, String color, int height, int width, int maxUsersWeight, int numOfSeats, boolean foldable){
        if (numOfSofas == 9){
            System.out.println("The warehouse is full");
        } else {
            sofas[numOfSofas] = new Sofa(typeOfUpholstery, color, height, width, maxUsersWeight, numOfSeats, foldable);
            numOfSofas += 1;
        }
    }

    public void AddBed(String typeOfUpholstery, String color, int height, int width, int maxUsersWeight, int length){
        if (numOfBeds == 9){
            System.out.println("The warehouse is full");
        } else {
            beds[numOfBeds] = new Bed(typeOfUpholstery, color, height, width, maxUsersWeight, length);
            numOfBeds += 1;
        }
    }

    @Override
    public String toString() {
        return "FurnitureShop{\n" +
                "armchairs=" + Arrays.toString(armchairs) +
                "\nsofas=" + Arrays.toString(sofas) +
                "\nbeds=" + Arrays.toString(beds) +
                "\n}";
    }
}
