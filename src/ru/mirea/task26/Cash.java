package ru.mirea.task26;

class Cash extends Shop {
    Cash(){
        this.payStrategy = new Wallet();
    }
}