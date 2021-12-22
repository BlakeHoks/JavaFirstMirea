package ru.mirea.task26;

import java.util.Scanner;
import ru.mirea.task26.Shop;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как будете проводить оплата покупку(Карта или Наличка)?");
        String payment = scanner.next();
        switch (payment){
            case "Карта":{
                Shop creditCard = new CreditCard();
                creditCard.placeOrder();
                creditCard.pay();
                break;
            }
            case "Наличка":{
                Shop cash = new Cash();
                cash.placeOrder();
                cash.pay();
                break;
            }
            default:{
                System.out.println("Несуществующий способ оплаты");
            }
        }
    }
}