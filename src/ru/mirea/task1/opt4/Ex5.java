package ru.mirea.task1.opt4;

import java.util.Scanner;

public class Ex5 {
    public static int fact(int a){
        int result = 1;
        for (int i = 1; i <= a; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(fact(sc.nextInt()));
    }
}
