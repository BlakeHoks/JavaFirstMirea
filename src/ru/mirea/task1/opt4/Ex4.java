package ru.mirea.task1.opt4;

import java.util.Arrays;

public class Ex4 {
    public static void main(String [ ] args){
        int [] arr = new int [10];
        System.out.println("Original list:");
        for (int i = 0; i < 10; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------");
        System.out.println("Sorted list:");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
