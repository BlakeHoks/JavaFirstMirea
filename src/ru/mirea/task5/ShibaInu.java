package ru.mirea.task5;

public class ShibaInu extends Dog{
    public ShibaInu(int age, int height, int weight, String name){
        super(age, height, weight, name);
        this.breedName = "Shiba Inu";
    }

    public ShibaInu(int age, String name){
        super(age, name);
        this.breedName = "Shiba Inu";
    }

    public void ProtectHome(){
        System.out.println("Now our house is under " + name + " protection");
    }
}
