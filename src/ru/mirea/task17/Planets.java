package ru.mirea.task17;

import java.util.Scanner;

public class Planets {

    public static enum Planet{
        Mercury(3.302 * Math.pow(10, 23), 2440 * Math.pow(10, 3)),
        Venus(4.869 * Math.pow(10, 24), 6052 * Math.pow(10, 3)),
        Earth(5.974 * Math.pow(10, 24), 6400 * Math.pow(10, 3)),
        Mars(6.419 * Math.pow(10, 23), 3382 * Math.pow(10, 3)),
        Jupiter(1.899 * Math.pow(10, 27), 66850 * Math.pow(10, 3)),
        Saturn(5.685 * Math.pow(10, 26), 54360 * Math.pow(10, 3)),
        Uranus(8.685 * Math.pow(10, 25), 24970 * Math.pow(10, 3)),
        Neptune(1.024 * Math.pow(10, 26), 24340 * Math.pow(10, 3));

        private double weight;
        private double radius;

        private Planet(double weight, double radius){
            this.weight = weight;
            this.radius = radius;
        }

        public double getRadius(){
            return radius;
        }

        public double getWeight(){
            return weight;
        }

        public double findPower(double weight){
            return 6.67408 * Math.pow(10, -11) * this.weight * weight / Math.pow(this.radius, 2);
        }
    }

    public static void main(String[] args) {
        System.out.print("Для рассчёта силы тяжести введите свой вес: ");
        Scanner in = new Scanner(System.in);
        double weight = in.nextDouble();
        System.out.println("Выберите планету (1 - Меркурий, 2 - Венера, 3 - Земля, 4 - Марс, 5 - Юпитер, 6 - Сатурн, 7 - Уран, 8 - Нептун");
        int planet = in.nextInt();
        switch (planet) {
            case 1 -> System.out.println("Сила притяжения Меркурия - " + Planet.Mercury.findPower(weight));
            case 2 -> System.out.println("Сила притяжения Венеры - " + Planet.Venus.findPower(weight));
            case 3 -> System.out.println("Сила притяжения Земли - " + Planet.Earth.findPower(weight));
            case 4 -> System.out.println("Сила притяжения Марса - " + Planet.Mars.findPower(weight));
            case 5 -> System.out.println("Сила притяжения Юпитера - " + Planet.Jupiter.findPower(weight));
            case 6 -> System.out.println("Сила притяжения Сатурна - " + Planet.Saturn.findPower(weight));
            case 7 -> System.out.println("Сила притяжения Урана - " + Planet.Uranus.findPower(weight));
            case 8 -> System.out.println("Сила притяжения Нептуна - " + Planet.Neptune.findPower(weight));
        }
    }
}