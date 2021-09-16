package ru.mirea.task1.opt4;

public class Ex1 {
    public static void main(String [] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        sum = 0;
        int i = 0;
        while (i < 10){
            sum += arr[i];
            i++;
        }
        System.out.println(sum);
        sum = 0;
        i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < 10);
        System.out.println(sum);
    }
}
