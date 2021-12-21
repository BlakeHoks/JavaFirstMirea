package ru.mirea.task22;

enum ChairType{
    VICTORIAN,
    MULTI,
    MAGIC
}

public class ChairFact{
    public Chair createChair(ChairType type){
        Chair chair = null;

        switch (type){
            case VICTORIAN:
                chair = new VictorianChair();
                break;
            case MULTI:
                chair = new MultiChair();
                break;
            case MAGIC:
                chair = new MagicChair();
                break;
        }
        return chair;
    }
}