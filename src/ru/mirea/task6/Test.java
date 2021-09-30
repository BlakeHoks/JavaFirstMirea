package ru.mirea.task6;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Lucky");
        Car car = new Car();
        Banana apple = new Banana(30);
        System.out.println(cat.getName());
        System.out.println(car.getName());
        System.out.println(apple.getPrice());
        System.out.println(car.getPrice());
    }
}
