package ru.mirea.task5;

public class Labrador extends Dog{
    public Labrador(int age, int height, int weight, String name){
        super(age, height, weight, name);
        this.breedName = "Labrador";
    }

    public Labrador(int age, String name){
        super(age, name);
        this.breedName = "Labrador";
    }

    public void Sleep(){
        System.out.println("Zzzzzzz... he is sleeping");
    }
}
