package ru.mirea.task20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DataCalendar {
    public static void main(String[] args) {
        System.out.println("Введите *год* *месяц* *число* *часы* *минуты*");
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, scanner.nextInt());
        String month = scanner.next();
        int monthnumber = 1;
        switch (month){
            case "January":{
                break;
            }
            case "February":{
                monthnumber = 2;
                break;
            }case "March":{
                monthnumber = 3;
                break;
            }
            case "April":{
                monthnumber = 4;
                break;
            }case "May":{
                monthnumber = 5;
                break;
            }case "June":{
                monthnumber = 6;
                break;
            }case "July":{
                monthnumber = 7;
                break;
            }
            case "August":{
                monthnumber = 8;
                break;
            }
            case "September":{
                monthnumber = 9;
                break;
            }
            case "October":{
                monthnumber = 10;
                break;
            }
            case "November":{
                monthnumber = 11;
                break;
            }
            case "December":{
                monthnumber = 12;
                break;
            }
        }
        calendar.set(Calendar.MONTH, monthnumber - 1);
        calendar.set(Calendar.DAY_OF_MONTH, scanner.nextInt());
        calendar.set(Calendar.HOUR_OF_DAY, scanner.nextInt());
        calendar.set(Calendar.MINUTE, scanner.nextInt());
        calendar.set(Calendar.SECOND, 0);
        System.out.println("Введённая дата: " + calendar.getTime());
        System.out.println();

        System.out.println("Мирошников, срок выполнения задания 17 дней");
        System.out.print("Получено: ");
        Calendar calendar2 = new GregorianCalendar(2021, 0 , 25, 12, 45);
        System.out.println(calendar2.get(Calendar.DAY_OF_MONTH) + " " + calendar2.get(Calendar.MONTH) + " " +
                calendar2.get(Calendar.YEAR) + " " + calendar2.get(Calendar.HOUR) + ":" + calendar2.get(Calendar.MINUTE));
        calendar2.add(Calendar.DAY_OF_MONTH, 17);
        System.out.print("Дата сдачи: ");
        System.out.println(calendar2.get(Calendar.DAY_OF_MONTH) + " " + calendar2.get(Calendar.MONTH) + " " +
                calendar2.get(Calendar.YEAR) + " " + calendar2.get(Calendar.HOUR) + ":" + calendar2.get(Calendar.MINUTE));
    }
}