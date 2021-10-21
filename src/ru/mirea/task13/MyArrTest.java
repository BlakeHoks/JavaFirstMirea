package ru.mirea.task13;

import ru.mirea.task13.MyArr;

public class MyArrTest {
    public static void main(String[] args){
        MyArr<String> Arr = new MyArr<String>(3);
        Arr.add("lol");
        Arr.add("kek");
        Arr.add("999");
        Arr.add("pluh");
        System.out.println(Arr);
        Arr.add(2, "chebureck");
        System.out.println(Arr);
        System.out.println(Arr.getLength());
        System.out.println(Arr.get(4));
        Arr.remove(3);
        System.out.println(Arr.isEmpty());
        System.out.println(Arr);
    }
}
