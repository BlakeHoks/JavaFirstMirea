package ru.mirea.task26;

import java.util.Scanner;

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
        System.out.println("Введите номер карты: ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}

class Wallet implements PayStrategy{
    @Override
    public void paymentMethod() {
        System.out.println("Выбрать купюры");
    }
}