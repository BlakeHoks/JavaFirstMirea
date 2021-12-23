package ru.mirea.task10;

import ru.mirea.task5.Pan;

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

    public static int NumOfMaxElems(int max){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n != 0) {
            if (max < n){
                max = n;
                return NumOfMaxElems(max);
            } else {
                if (max == n){
                    return NumOfMaxElems(max) + 1;
                } else {
                    return NumOfMaxElems(max);
                }
            }
        }
        else {
            return 1;
        }
    }

    public static int MaxOfSequence(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max;
        if (n != 0) {
            max = MaxOfSequence();
            if (max > n){
                return max;
            } else {
                return n;
            }
        }
        else {
            return n;
        }
    }

    public static void TriangularSequence(int n, int c){
        if (c != n + 1){
            System.out.print(c);
            for (int i = 0; i < c-1; i++) {
                System.out.print(c);
            }
            System.out.print('\n');
            TriangularSequence(n, c + 1);
        }
    }

    public static void FromCurToN(int cur, int n){
        if (cur != n){
            System.out.println(cur);
            FromCurToN(cur + 1,n);
        } else {
            System.out.println(n);
        }
    }

    public static void main(String[] args){
        System.out.println("15. Digits of number from right to left:");
        DigitsFromRightToLeft(56789);
        System.out.println("16. Number of max elements are " + NumOfMaxElems(0));
        System.out.println("2. Numbers from 1 to 5:");
        FromCurToN(1, 5);
        System.out.println("1. Triangular sequence:");
        TriangularSequence(4, 1);
        System.out.println("17. Maximun of sequence are:");
        System.out.println(MaxOfSequence());
    }
}
