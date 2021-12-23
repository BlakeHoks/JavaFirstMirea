package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City {
    private String city;
    private String country;

    public City(String city, String country){
        this.city = city;
        this.country = country;
    }

    public static void main(String[] args){
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Tokio", "Japan"));
        cities.add(new City("Kioto", "Japan"));
        cities.add(new City("Fukuoka", "Japan"));
        cities.add(new City("London", "England"));
        cities.add(new City("Manchester", "England"));
        cities.add(new City("Detroit", "USA"));
        cities.add(new City("Washington", "USA"));
        cities.add(new City("Pusan", "South Korea"));
        cities.add(new City("Seoul", "South Korea"));

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (City city : cities) {
            if (!map.containsKey(city.country)) {
                map.put(city.country, null);
            }
        }

        for (Map.Entry<String, ArrayList<String>> item: map.entrySet()){
            ArrayList<String> temp = new ArrayList<>();
            for (City city : cities) {
                if (item.getKey() == city.country){
                    temp.add(city.city);
                }
            }
            item.setValue(temp);
        }

        for (Map.Entry<String, ArrayList<String>> item: map.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
            System.out.print("");
        }
    }
}