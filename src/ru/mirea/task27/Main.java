package ru.mirea.task27;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> journal = new HashMap<>();
        journal.put("Miroshnikov","Yaroslav");
        journal.put("Ivanov","Ivan");
        journal.put("Petrov","Petr");
        journal.put("Fedorov","Fedor");
        journal.put("Kozlov","Dmitri");
        journal.put("Ten","Dmitri");
        journal.put("Toropov","Kirill");
        journal.put("Ivanovich","Petr");
        journal.put("Beliy","Artem");
        journal.put("Krasnov","Sergey");
        HashMap<String, String> jcopy = (HashMap<String, String>) journal.clone();
        for (Map.Entry<String, String> i : jcopy.entrySet()) {
            for (Map.Entry<String, String> j : jcopy.entrySet()) {
                if (i.getValue().equals(j.getValue()) && !(i.getKey().equals(j.getKey()))){
                    journal.remove(j.getKey());
                }
            }
        }
        System.out.println(journal);
    }
}