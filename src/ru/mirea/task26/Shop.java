package ru.mirea.task26;

public class Shop {
    PayStrategy payStrategy;
    public void placeOrder(){
        System.out.println("Оформление заказа");
    }
    public void pay(){
        payStrategy.paymentMethod();
    }
}

interface PayStrategy{
    void paymentMethod();
}

class CardData implements PayStrategy{
    @Override
    public void paymentMethod() {
        System.out.println("Ввод данных карты");
    }
}

class Wallet implements PayStrategy{
    @Override
    public void paymentMethod() {
        System.out.println("Выбрать купюры");
    }
}