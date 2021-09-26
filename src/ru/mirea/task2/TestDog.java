package ru.mirea.task2;

import java.util.Scanner;

public class TestDog {
    private static Dog[] dogs = new Dog[10];
    private static int numOfDogs = 0;
    public static void AddDogs(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of dogs you want to add:");
        int size = in.nextInt();
        numOfDogs += size;
        for (int i = 0; i < numOfDogs; i++){
            System.out.print("Enter dog's name:");
            String name = in.next();
            System.out.print("Enter dog's age:");
            int age = in.nextInt();
            dogs[i] = new Dog(name, age);
        }
    }
    public static void main(String[] args){
        AddDogs();
        for (int i = 0; i < numOfDogs; i++) {
            System.out.println(dogs[i]);
        }
    }
}
