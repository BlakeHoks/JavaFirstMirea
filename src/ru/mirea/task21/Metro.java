package ru.mirea.task21;

import java.util.ArrayList;
import java.util.List;

public class Metro {

    public static class MetroList{
        List<String> metroStations = new ArrayList<>();

        public MetroList(){
            metroStations.add("Сокольническая");
            metroStations.add("Замоскворецкая");
            metroStations.add("Арбатско-Покровская");
            metroStations.add("Филёвская");
            metroStations.add("Кольцевая");
            metroStations.add("Калужско-Рижская");
            metroStations.add("Таганско-Краснопресненская");
            metroStations.add("Калининская");
            metroStations.add("Серпуховско-Тимирязевская");
            metroStations.add("Люблинско-Дмитровская");
            metroStations.add("Бутовская");
            metroStations.add("Большая Кольцевая");
            metroStations.add("Московское Центральное Кольцо");
            metroStations.add("Некрасовская");
            metroStations.add("Троицкая");
            metroStations.add("Монорельс");
        }

        public void PrintList(boolean flag){
            for (String metro: metroStations) {
                if (flag){
                    System.out.println(metro);
                    flag = false;
                }
                else{
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        MetroList metroList = new MetroList();
        metroList.PrintList(false);
    }
}