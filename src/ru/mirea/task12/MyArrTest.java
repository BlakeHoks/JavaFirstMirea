package ru.mirea.task12;

public class MyArrTest {
    public static void main(String[] args){
        MyArr <String> Arr = new MyArr<String>(3);
        Arr.add("lol");
        Arr.add("kek");
        Arr.add("999");
        Arr.add("pluh");
        Arr.add(2, "chebureck");
        System.out.println(Arr);
    }
}
