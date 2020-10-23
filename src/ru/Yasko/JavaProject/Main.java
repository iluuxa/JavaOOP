package ru.Yasko.JavaProject;

import ru.Yasko.JavaProject.Lab11.Lab11;
import ru.Yasko.JavaProject.Lab13.Lab13;
import ru.Yasko.JavaProject.lab12.Lab12;
import ru.Yasko.JavaProject.lab7.Lab7;
import ru.Yasko.JavaProject.Lab8.Lab8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
            case 12:
                Lab12.run();
            case 13:
                Lab13.run();
        }
    }
}
