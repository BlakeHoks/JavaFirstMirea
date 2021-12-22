package ru.mirea.task23;

public class Main {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Apple", 0.1);
        Fruit fruit2 = new Fruit("Watermelon", 5);
        Fruit fruit3 = new Fruit("Banana", 1.5);
        Fruit fruit4 = new Fruit("Grape", 0.5);
        Fruit fruit5 = new Fruit("Orange", 0.3);

        System.out.println("Сравним "+fruit1.getName()+" и "+ fruit2.getName());
        System.out.println(fruit1.equals(fruit2));
        System.out.println("Сравним "+fruit1.getName()+" и "+fruit3.getName());
        System.out.println(fruit1.equals(fruit3));
        System.out.println("Сравним "+fruit1.getName()+" и "+fruit4.getName());
        System.out.println(fruit1.equals(fruit4));
        System.out.println("Сравним "+fruit1.getName()+" и "+fruit5.getName());
        System.out.println(fruit1.equals(fruit5));

        System.out.println("Сравним "+fruit2.getName()+" и "+fruit3.getName());
        System.out.println(fruit2.equals(fruit3));
        System.out.println("Сравним "+fruit2.getName()+" и "+fruit4.getName());
        System.out.println(fruit2.equals(fruit4));
        System.out.println("Сравним "+fruit2.getName()+" и "+fruit5.getName());
        System.out.println(fruit2.equals(fruit5));

        System.out.println("Сравним "+fruit3.getName()+" и "+fruit4.getName());
        System.out.println(fruit3.equals(fruit2));
        System.out.println("Сравним "+fruit3.getName()+" и "+fruit5.getName());
        System.out.println(fruit3.equals(fruit2));

        System.out.println("Сравним "+fruit4.getName()+" и "+fruit5.getName());
        System.out.println(fruit4.equals(fruit5));

        System.out.println("Сравним "+fruit1.getName()+" и "+fruit1.getName());
        System.out.println(fruit1.equals(fruit1));

        System.out.println("Сравним "+fruit2.getName()+" и "+fruit2.getName());
        System.out.println(fruit2.equals(fruit2));

        System.out.println("Сравним "+fruit3.getName()+" и "+fruit3.getName());
        System.out.println(fruit3.equals(fruit3));

        System.out.println("Сравним "+fruit4.getName()+" и "+fruit4.getName());
        System.out.println(fruit4.equals(fruit4));

        System.out.println("Сравним "+fruit5.getName()+" и "+fruit5.getName());
        System.out.println(fruit5.equals(fruit5));

        System.out.println("полученные хэши");
        System.out.println(fruit1.getName() + " - " + fruit1.hashCode());
        System.out.println(fruit2.getName() + " - " + fruit2.hashCode());
        System.out.println(fruit3.getName() + " - " + fruit3.hashCode());
        System.out.println(fruit4.getName() + " - " + fruit3.hashCode());
        System.out.println(fruit5.getName() + " - " + fruit3.hashCode());
    }
}