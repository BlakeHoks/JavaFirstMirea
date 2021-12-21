package ru.mirea.task19;

import java.util.Scanner;

public class Triangle {

    public static class TriangleException extends Exception{
        public String toString(){
            return "Такого прямоугольного треугольника не существует";
        }
    }

    public static class RightTriangle{
        double a, b, c;

        public RightTriangle(double a, double b, double c) throws TriangleException {
            if ((a + b + c == 180) && ((a == 90 && b != 90 && c != 90) || (a != 90 && b == 90 && c != 90) || (a != 90 && b != 90 && c == 90))) {
                System.out.println("Введён прямоугольный треугольник");
            } else {
                throw new TriangleException();
            }
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        RightTriangle rightTriangle = new RightTriangle(a, b, c);
    }
}