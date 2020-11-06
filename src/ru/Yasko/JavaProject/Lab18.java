package ru.Yasko.JavaProject;

import java.util.Scanner;

public class Lab18 {
    public static void run(){
        Scanner in = new Scanner(System.in);
        int sw=in.nextInt();
        switch (sw){
            case 1:
                break;
            case 2:
                palindrome(0,in.next());
                break;
            case 3:
                System.out.println(max());
                break;
        }
    }
    public static int max(){
        Scanner in = new Scanner(System.in);
        int cur = in.nextInt();
        int max=-1;
        while (cur!=0){
            if(cur>max){
                max=cur;
            }
            cur = in.nextInt();
        }
        return max;
    }
    public static void palindrome(int i,String x){
        if(i>=x.length()){
            System.out.println("YES");
            return;
        }
        if(x.charAt(i)==x.charAt(x.length()-i-1)){
            palindrome(i+1,x);
        }
        else{
            System.out.println("NO");
            return;
        }
    }
}
