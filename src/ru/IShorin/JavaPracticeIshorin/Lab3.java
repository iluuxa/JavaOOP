package ru.IShorin.JavaPracticeIshorin;

import java.util.Scanner;

public class Lab3 {
    public static void run(){
        Scanner in=new Scanner(System.in);
        Circle circle=new Circle(12);
        CircleTester.displayInfo(circle);
        Human dummy = new Human(200,30,20,87,5,90,10,true,false,false,false,false);
        Human inv = new Human(190, 28,20,74,6,4,3,80,12,true,false,false,true,true,true,false);
        dummy.arm1.setDamaged(true);
        inv.arm1.hand1.setFingersnumber(0);
        dummy.DisplayCharacteristics();
        String author=in.nextLine();
        String title =in.nextLine();
        int year = in.nextInt();
        Book book = new Book(author,title,year);
        BookTest.displayInfo(book);
    }
}
