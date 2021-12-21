package ru.mirea.task24;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static class IPAddressValidator
    {
        private static final String IP_ADDRESS_PATTERN = "(?:[0-9]\\.|[1-9]{2}\\.|1[1-9]{2}\\.|2[1-5][1-5]\\.){3}(?:[0-9]|[1-9]{2}|1[1-9]{2}|2[1-5][1-5])";
        private final Pattern pattern;
        public IPAddressValidator()
        {
            pattern = Pattern.compile(IP_ADDRESS_PATTERN);
        }
        public boolean validate(String ipAddress)
        {
            return pattern.matcher(ipAddress).matches();
        }
    }

    public static void main(String[] args) {

        System.out.print("Введите ip-адрес: ");
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine();
        IPAddressValidator ipAddressValidator = new IPAddressValidator();
        if (ipAddressValidator.validate(ip)){
            System.out.println("Вы ввели ip-адрес верно");
        }
        else{
            System.out.println("Вы ввели ip-адрес неверно");
        }
    }
}