package ru.mirea.task3;

public class TestHuman {
    public static void main(String[] args){
        Human man = new Human();
        System.out.println(man);
        man.BentLeftHand();
        man.BrakeRightLeg();
        man.BentLeftLeg();
        man.Evolve();
        man.Evolve();
        man.Evolve();
        man.Degrade();
        man.BaldHaircut();
        System.out.println("---------------------------------------------------------------");
        System.out.println("3 years ago...");
        System.out.println(man);
    }
}
