package ru.IShorin.JavaPracticeIshorin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lab=in.nextInt();
        switch(lab) {
            case 1:
            Lab1 lab1 = new Lab1();
            lab1.run();
            break;
            case 2:
                Lab2 lab2=new Lab2();
                lab2.run();
        }
    }
}
