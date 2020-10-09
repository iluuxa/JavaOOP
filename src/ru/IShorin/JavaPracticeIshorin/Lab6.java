package ru.IShorin.JavaPracticeIshorin;

import ru.IShorin.JavaPracticeIshorin.Lab8.MovableRectangle;

import java.util.Scanner;

public class Lab6 {
    static void run(){
        Scanner in=new Scanner(System.in);
        int a,b,x,y,speedx,speedy;
        System.out.println("Задайте стороны прямоугольника: ");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Задайте позицию прямоугольника: ");
        x=in.nextInt();
        y=in.nextInt();
        System.out.println("Задайте скорость прямоугольника: ");
        speedx=in.nextInt();
        speedy=in.nextInt();
        MovableRectangle movableRectangle=new MovableRectangle(a,b,x,y,speedx,speedy);
        movableRectangle.displayPosition();
        System.out.println("Сколько раз сдвинуть прямоугольник?");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            movableRectangle.move();
            movableRectangle.displayPosition();
        }

    }
}
