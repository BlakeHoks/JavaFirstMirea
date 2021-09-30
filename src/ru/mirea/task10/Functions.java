package ru.mirea.task10;

import java.util.Scanner;

public class Functions {
    public static void DigitsFromRightToLeft(int n){
        if (n >= 10) {
            System.out.println(n % 10);
            n /= 10;
            DigitsFromRightToLeft(n);
        } else {
            System.out.println(n);
        }
    }

    public static void NumOfMaxElems(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[3];
        int i = 0;
        while (num != 0) {
            num = in.nextInt();
            arr[i] = num;
            i++;
        }
        System.out.println(arr);

    }

    public static void main(String[] args){
        //DigitsFromRightToLeft(1236128);
        NumOfMaxElems();
    }
}
