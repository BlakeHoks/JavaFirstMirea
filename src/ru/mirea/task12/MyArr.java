package ru.mirea.task12;

import ru.mirea.task5.Pan;

public class MyArr<Type> {
    private Object[] arr;
    private int length = 0;

    public MyArr(){
        arr = new Object[3];
    }

    public MyArr(int length){
        arr = new Object[length];
    }

    private void IncreaseLength(){
        Object[] temp = arr;
        arr = new Object[length*2 + 1];
        for (int i = 0; i < length; i++){
            arr[i] = temp[i];
        }
    }

    public void add(Type element){
        if (length >= arr.length) {
            IncreaseLength();
        }
        arr[length] = element;
        length++;
    }

    public void add(int index, Type element){
        if (length >= arr.length){
            IncreaseLength();
        }
        for (int i = length; i > index; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        length++;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < length; i++){
            s += arr[i] + " ";
        }
        return s;
    }

    public static void main(String[] args){
    }
}
