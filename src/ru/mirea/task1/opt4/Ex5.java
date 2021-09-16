package ru.mirea.task1.opt4;

public class Ex5 {
    public static int fact(int a){
        int result = 1;
        for (int i = 1; i <= a; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String [] args){
        System.out.println(fact(5));
    }
}
