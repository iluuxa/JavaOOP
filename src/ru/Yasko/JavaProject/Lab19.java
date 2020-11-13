package ru.Yasko.JavaProject;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Lab19 {
    public static void run(){
        File file = new File("D://trash/IdeaProjects/JavaOOP/userfile.txt");
        try{
        file.createNewFile();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        int sw;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите действие:\n0 - завершить выполнение программы\n1 - Записать в файл введённую с клавиатуры информацию\n2 - Отобразить содержимое файла\n3 - Заменить информацию в файле на информацию, введённую с клавиатуры\n4 - Добавить текст в конец исходного файла");
        sw =in.nextInt();
        String input="";
        int output;
        FileWriter fileWriter;
        FileReader fileReader;
        while (sw!=0){
            try {
                switch (sw) {
                    case 1:case 3:
                        fileWriter = new FileWriter(file, false);
                        input=in.nextLine();
                        input=in.nextLine();
                        fileWriter.write(input);
                        fileWriter.close();
                        break;
                    case 2:
                        fileReader=new FileReader(file);
                        while ((output=fileReader.read())!=-1){
                            System.out.print((char)(output));
                        }
                        fileReader.close();
                        break;
                    case 4:
                        fileWriter = new FileWriter(file, true);
                        input=in.nextLine();
                        input=in.nextLine();
                        fileWriter.write(input);
                        fileWriter.close();
                        break;
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Введите следующее действие:");
            sw =in.nextInt();
        }
    }
}
