package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args){
        Author A = new Author("Anton Chehov", "chehov12345@yandex.ru", 'M');
        A.setEmail("chehov@yandex.ru");
        System.out.println(A);
    }
}
