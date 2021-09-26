package ru.mirea.task2;

public class Book {
    private String title;
    private int numOfPages;

    public Book(String title, int numOfPages){
        this.title = title;
        this.numOfPages = numOfPages;
    }
    public Book(String title){
        this.title = title;
        this.numOfPages = 300;
    }
    public Book(){
        this.title = "Book";
        this.numOfPages = 420;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setNumOfPages(int numOfPages){
        this.numOfPages = numOfPages;
    }
    public String getTitle(){
        return title;
    }
    public int getNumOfPages(){
        return numOfPages;
    }
    public String toString(){
        return this.title + ", number of pages = " + this.numOfPages;
    }
    public void printPrice(){
        System.out.println(title + "'s price = " + (numOfPages * 0.5));
    }
}
