package ru.IShorin.JavaPracticeIshorin;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Lab10 {
    int res =0;
    public void run(){
        int k,s,d,t,ts,a,b;
        double temp,prev;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите k:");
        k=in.nextInt();
        System.out.println("Введите d:");
        d=in.nextInt();
        System.out.println("Введите a:");
        a=in.nextInt();
        System.out.println("Введите b:");
        b=in.nextInt();
        System.out.println("Введите N:");
        int n =in.nextInt();
        s=0; ts =0;
        if((k==0)&&(d==0)){System.out.println(1);}
        for(int i=(int)pow(10,k-1);i<(int)pow(10,k);i++){
            t=i;
            for(int j=0;j<k;j++){
                s+=t%10;
                t/=10;
            }
            if(s==d){ts++;}
            s=0;
        }
        if((k==0)&&(d==0)){System.out.println(1);}
        System.out.println("Количество "+k+"-значных чисел, сумма цифр которых составляет "+d+": "+ts);
        build(a,b,"");
        System.out.println("Количество последовательностей из 0 и 1: "+ res);
        System.out.println("Число по цифрам: ");
        rec(n);
    }
    void rec(int n){
        if(n>0){
            rec(n/10);
            System.out.println(n%10);
        }
    }

    public void build(int a,int b, String cur){
        if(cur.length()==0){
            build(a, b, cur + "1");
            build(a, b, cur + "0");
            return;
        }
        if(cur.length()<a+b){
            if(cur.charAt(cur.length()-1)=='0'){
                build(a,b,cur+"1");
            }
            else {
                build(a, b, cur + "1");
                build(a, b, cur + "0");
            }
        }
        else{
            int sa=0;
            int sb =0;
            for(int i=0;i<cur.length();i++){
                if(cur.charAt(i)=='0'){
                    sa++;
                }
                else{
                    sb++;
                }
            }
            if((sb==b)&&(sa==a)){
                res++;
            }
        }
    }
}
