package ru.mirea.task26;

import ru.mirea.task26.CardData;
import ru.mirea.task26.Shop;

class CreditCard extends Shop {
    CreditCard(){
        this.payStrategy = new CardData();
    }
}