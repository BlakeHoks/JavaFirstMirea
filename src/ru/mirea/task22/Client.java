package ru.mirea.task22;

public class Client {

    private final ChairFact chairFactory = new ChairFact();

    public Client() {
    }

    public Chair sit(ChairType type){
        Chair chair = chairFactory.createChair(type);
        System.out.println("Вы садитесь на " + chair.name);
        return chair;
    }
}