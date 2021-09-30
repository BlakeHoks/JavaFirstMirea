package ru.mirea.task6;

public class Banana implements Priceable {
    private int price;

   public Banana(int price){
       this.price = price;
   }

   public Banana(){
       price = 20;
   }

    @Override
    public int getPrice() {
        return price;
    }
}
