package ru.Yasko.JavaProject.Lab16;


import java.util.Scanner;

public class Lab16 {
    public static void run(){
        Queue deck1=new Queue();
        Queue deck2 = new Queue();
        Scanner in = new Scanner(System.in);
        String first=in.nextLine();
        String second = in.nextLine();
        for(int i=0;i<first.length();i+=2){
            deck1.add((int)(first.charAt(i))-48);
            deck2.add((int)(second.charAt(i))-48);
        }
        int comp;
        for(int i=0;i<106;i++){
            if(deck1.getLength()==0){
                System.out.println("Second "+i);
                return;
            }
            if(deck2.getLength()==0){
                System.out.println("First "+i);
                return;
            }
            comp=deck1.peek()-deck2.peek();
            if(comp>0){
                if(comp==9){
                    deck2.add(deck1.take());
                    deck2.add(deck2.take());
                }
                else {
                    deck1.add(deck1.take());
                    deck1.add(deck2.take());
                }
            }
            else{
                if(comp==-9){
                    deck1.add(deck1.take());
                    deck1.add(deck2.take());
                }
                else {
                    deck2.add(deck1.take());
                    deck2.add(deck2.take());
                }
            }
        }
        System.out.println("botva");
    }
}
