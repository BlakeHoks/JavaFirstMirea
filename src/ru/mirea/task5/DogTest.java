package ru.mirea.task5;

public class DogTest {
    public static void main(String[] args){
        ShibaInu shiba = new ShibaInu(5, "Cake");
        Labrador lab = new Labrador(10, 55, 35, "Bobby");
        Beagle beg = new Beagle(2, "Bonnie");

        System.out.println(lab.getHeight());
        shiba.getOlder();
        shiba.getOlder();
        shiba.getOlder();
        shiba.InHumanYears();
        System.out.println(shiba.getBreedName());
        beg.setHeight(20);
        beg.setWeight(8);
        System.out.println(lab.getAge());
        lab.setWeight(31);
        System.out.println(beg);
        System.out.println(lab);
        System.out.println(shiba);
    }
}
