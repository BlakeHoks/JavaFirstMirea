package ru.mirea.task2;

public class Ball {
    private String type;
    private int size;

    public Ball(String type, int size){
        this.type = type;
        this.size = size;
    }
    public Ball(String type){
        this.type = type;
        this.size = 5;
    }
    public Ball(){
        this.type = "Baseball";
        this.size = 2;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setSize(int size){
        this.size = size;
    }
    public String getType(){
        return type;
    }
    public int getSize(){
        return size;
    }
    public String toString(){
        return this.type + ", size = " + this.size;
    }
}
