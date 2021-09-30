package ru.mirea.task10;

import java.util.Scanner;

public class Recursion {
    public static int withoutZero(int a, int b){
        if(a==0){
            return 1;
        }
        else if (a==1){
            return b+1;
        }
        else if (b==0 && a>1){
            return 0;
        }
        else {
            return withoutZero(a - 1, b - 1)+withoutZero(a, b - 1);
        }
    }

    public static int reverse(int a, int b){
        if (a == 0) {
            return b;
        }
        else {
            return reverse(a / 10, 10 * b + a % 10);
        }
    }

    public static int counter(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n!=0){
            if (n == 1){
                return counter()+1;
            }
            else{
                return counter();
            }
        }
        else {
            n = in.nextInt();
            if (n == 0){
                return 0;
            }
            else{
                return counter();
            }

        }
    }
    public static void main(String[] args) {
        System.out.println(withoutZero(2,3));
        System.out.println(reverse(12345,0));
        System.out.println(counter());
    }
}
