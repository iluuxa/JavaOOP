package ru.IShorin.JavaPracticeIshorin;

import java.util.Random;
import java.util.Scanner;

public class Lab1 {
    public static void run(){
        Scanner in = new Scanner(System.in);
        Random rand=new Random();
        int n=in.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            a[i]=(int)(Math.random()*32756);
            b[i]=rand.nextInt();
            s+=a[i];
            System.out.println(a[i]);
        }
        System.out.println("Сумма массива: "+s);
    s=0;
        for(int i=0;i<n;i++){
        System.out.println(b[i]);
        s+=b[i];
    }
        System.out.println("Сумма массива: "+s);
        System.out.println("Факториал: "+factorial(n));
    }
    public static double factorial(int n){
        if(n>0){
            return (n*factorial(n-1));
        }
        else{
            return 1;
        }
    }
}
