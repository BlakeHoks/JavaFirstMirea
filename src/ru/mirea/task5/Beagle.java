package ru.mirea.task5;

public class Beagle extends Dog{
    public Beagle(int age, int height, int weight, String name){
        super(age, height, weight, name);
        this.breedName = "Beagle";
    }

    public Beagle(int age, String name){
        super(age, name);
        this.breedName = "Beagle";
    }

    public void LookFor(String smth){
        System.out.println("Our dog is looking for " + smth + ". Be ready to accept a gift");
    }
}
