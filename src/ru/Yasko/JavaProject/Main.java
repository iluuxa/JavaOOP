package ru.Yasko.JavaProject;

import ru.Yasko.JavaProject.Lab11.Lab11;
import ru.Yasko.JavaProject.Lab13.Lab13;
import ru.Yasko.JavaProject.Lab15.Lab15;
import ru.Yasko.JavaProject.Lab16.Lab16;
import ru.Yasko.JavaProject.lab12.Lab12;
import ru.Yasko.JavaProject.lab7.Lab7;
import ru.Yasko.JavaProject.Lab8.Lab8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер практической:");
        int lab=in.nextInt();
        switch(lab) {
            case 1: Lab1.run();
            break;
            case 2: Lab2.run();
            break;
            case 3: Lab3.run();
            break;
            case 5: Lab5.run();
            break;
            case 6: Lab6.run();
            break;
            case 7: Lab7.run();
            break;
            case 8: Lab8.run(args);
            break;
            case 10:
                Lab10 lab10=new Lab10();
                lab10.run();
            break;
            case 11:
                Lab11.run();
                break;
            case 12:
                Lab12.run();
                break;
            case 13:
                Lab13 lab13=new Lab13();
                lab13.run();
                break;
            case 15:
                Lab15.run();
                break;
            case 16:
                Lab16.run();
                break;
            case 18:
                Lab18.run();
                break;
            case 19:
                Lab19.run();
                break;
            case 20:
                Lab20.run();
                break;
            default:
                System.out.println("Нет такой работы");
                break;
        }
    }
}
