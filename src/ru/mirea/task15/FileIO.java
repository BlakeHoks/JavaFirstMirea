package ru.mirea.task15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class FileIO {
    public void overWrite(File file){
        try (FileWriter fileWriter = new FileWriter(file, false)){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter line");
            String st = sc.nextLine();
            fileWriter.write(st);
            fileWriter.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addWrite(File file){
        try (FileWriter fileWriter = new FileWriter(file, true)){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter line");
            String st = sc.nextLine();
            fileWriter.write(st);
            fileWriter.flush();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void printFile(File file){
        try (FileReader fileReader = new FileReader(file)){
            char [] text =  new char[200];
            int buf = fileReader.read(text);
            while (buf > 0){
                if (buf < 200)
                    text = Arrays.copyOf(text, buf);
                System.out.println(text);
                buf = fileReader.read(text);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        File file = new File("D:\\Proj\\JavaFirstMirea\\src\\ru\\mirea\\task15\\TextFile.txt");
        FileIO FileIO = new FileIO();
        Scanner sc = new Scanner(System.in);
        int t = 0;
        while (true){
            System.out.println("Введите чифру для выбора команды:\n1 - перезаписать файл\n2 - дописать в конец файла\n3 - считать файл\n0 - выйти");
            if (sc.hasNextInt())
                t = sc.nextInt();
            switch (t) {
                case 0: {
                    return;
                }
                case 1: {
                    FileIO.overWrite(file);
                    break;
                }
                case 2: {
                    FileIO.addWrite(file);
                    break;
                }
                case 3: {
                    FileIO.printFile(file);
                    break;
                }
            }
        }
    }
}