package ru.mirea.task29;

import java.io.Serializable;
import java.util.List;

public class CurrencyInfo implements Serializable {
    public String name;
    public String country;


    public CurrencyInfo(String name, String country) {
        this.name = name;
        this.country = country;
    }
    public String getCountry() {
        return this.country;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCountry(String country){
        this.country = name;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}