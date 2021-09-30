package ru.mirea.task5;

public class TestShop {
    public static void main(String[] args){
        FurnitureShop shop = new FurnitureShop();
        System.out.println(shop);
        shop.AddArmchairs(2);
        shop.AddBeds(1);
        shop.AddSofas(5);
        shop.getArmchairPrice();
        shop.BuyArmchair(15000);
        shop.getBedPrice();
        shop.BuyBed(300);
        shop.BuyBed(30000);
        shop.BuyBed(50000);
        System.out.println(shop);
    }
}
