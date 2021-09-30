package ru.mirea.task5;

public class TestShop {
    public static void main(String[] args){
        FurnitureShop shop = new FurnitureShop();
        shop.AddArmchair("Artificial leather", "Brown", 90, 70, 120, "Rocking chair");
        shop.AddArmchair("Textile", "Black", 150, 80, 100, "Office Armchair");
        shop.AddBed("Wood", "White", 50, 180, 220, 200);
        shop.AddSofa("Artificial leather", "Yellow", 80, 260, 300, 3, false);
        shop.AddSofa("Textile", "Orange", 100, 170, 220, 2, true);
        System.out.println(shop.armchairs[0].getHeight());
        System.out.println(shop.armchairs[0]);
        System.out.println(shop.sofas[1].getColor());
        //shop.beds[0].setLength(300);
        System.out.println(shop);
    }
}
