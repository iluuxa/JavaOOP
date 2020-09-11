package ru.IShorin.JavaPracticeIshorin;

import java.util.Scanner;

public class Lab2 {
    public static void run(){
        Scanner in=new Scanner(System.in);
        Shape triangle=new Shape("triangle",3,20,100);
        Shape circle = new Shape("circle",0,15,70);
        ShapeTester.displayInfo(circle);
        ShapeTester.displayInfo(triangle);
        ПитомникСобак питомникСобак= new ПитомникСобак();
        String name;
        int age;
        for (int i=0;i<5;i++) {
            name = in.next();
            age = in.nextInt();
            питомникСобак.addDog(new Dog(name,age));
        }
        питомникСобак.DisplayDogsInfo();
    }
}
