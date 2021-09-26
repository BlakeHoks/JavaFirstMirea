package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args){
        Book d1 = new Book ("The Divine Comedy","Dante", "1320");
        Book d2 = new Book ();
        Book d3 = new Book ("Crime and Punishment");
        d2.SetTitle("1984");
        d2.SetAuthor("George Orwell");
        d2.SetDate("1949");
        d3.SetAuthor("F. M. Dostoevsky");
        d3.SetDate("1866");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
