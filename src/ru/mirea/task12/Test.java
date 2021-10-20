package ru.mirea.task12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 0){
            arr.add(number);
            number = scanner.nextInt();
        }
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
        System.out.println("------------------------------");

        LinkedList <String> list = new LinkedList<String>();
        String str1 = new String("I ");
        String str2 = new String(" am ");
        String str3 = new String(" from ");
        String str4 = new String(" Russia");
        list.add(str1);
        list.add(str3);
        list.add(str4);
        System.out.println(list);
        list.add(1, str2);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.pollLast());
    }
}
