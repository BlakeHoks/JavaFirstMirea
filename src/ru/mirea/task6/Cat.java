package ru.mirea.task6;

public class Cat implements Nameable {
    private String name;

    public Cat(String name){
        this.name=name;
    }

    public Cat(){
        this.name ="котик";
    }

    @Override
    public String getName() {
        return name;
    }
}
