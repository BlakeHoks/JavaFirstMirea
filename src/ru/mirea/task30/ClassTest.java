package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClassTest {

    @Test
    public void checkToString() {
        MyArr<String> arr1 = new MyArr<String>();
        arr1.add("1");
        arr1.add("2");
        arr1.add("3");
        MyArr<String> arr2 = new MyArr<String>();
        arr2.add("Один");
        arr2.add("Два");
        arr2.add("Три");
        MyArr<String> arr3 = new MyArr<String>();
        arr3.add("John");
        arr3.add("Bill");
        arr3.add("Michael");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("1 2 3 ");
        expected.add("Один Два Три ");
        expected.add("John Bill Michael ");


        ArrayList<String> actual = new ArrayList<>();
        actual.add(arr1.toString());
        actual.add(arr2.toString());
        actual.add(arr3.toString());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyClients() {
        MyArr<String> arr1 = new MyArr<String>();
        arr1.add("1");
        arr1.add("2");
        arr1.add("3");

        int expected = 3;

        int actual = arr1.getLength();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllBalanceClients() {
        MyArr<String> arr1 = new MyArr<String>();
        arr1.add("1");
        arr1.add("2");
        arr1.add("3");
        MyArr<String> arr2 = new MyArr<String>();
        arr2.add("Один");
        arr2.add("Два");
        arr2.add("Три");
        MyArr<String> arr3 = new MyArr<String>();
        arr3.add("John");
        arr3.add("Bill");
        arr3.add("Michael");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("Два");
        expected.add("Michael");

        ArrayList<String> actual = new ArrayList<>();
        actual.add(arr1.get(1));
        actual.add(arr2.get(2));
        actual.add(arr3.get(3));

        Assert.assertEquals(expected, actual);
    }

}