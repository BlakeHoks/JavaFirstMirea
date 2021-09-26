package ru.mirea.task3;

public class Book {
    private String title;
    private String author;
    private String date;

    public Book(String title, String author, String date){
        this.title = title;
        this.author = author;
        this.date = date;
    }
    public Book(String title){
        this.title = title;
        this.author = "Author";
        this.date = "01.01.2000";
    }
    public Book(){
        this.title = "Book";
        this.author = "Author";
        this.date = "01.01.2000";
    }
    public void SetTitle(String title){
        this.title = title;
    }
    public void SetDate(String date){
        this.date = date;
    }
    public String GetTitle(){
        return title;
    }
    public String GetDate(){
        return date;
    }
    public void SetAuthor(String author){
        this.author = author;
    }
    public String GetAuthor(){
        return author;
    }
    public String toString(){
        return this.title + ", author is " + this.author + ", year of writing is " + this.date;
    }
}
