package ru.mirea.task29;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        CurrencyInfo currencyInfo = new CurrencyInfo("Ruble", "Russia");

        FileOutputStream outputStream = new FileOutputStream("save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);


        objectOutputStream.writeObject(currencyInfo);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo currencyInfo1 = (CurrencyInfo) objectInputStream.readObject();

        System.out.println(currencyInfo1);
    }

}