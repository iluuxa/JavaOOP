package ru.IShorin.JavaPracticeIshorin.lab7;

import java.util.Scanner;

public class Lab7 {
    public static void run(){
        Person person = new Person();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название мебели, которую хотите добавить или её id. Введите 'show', чтобы вывести список покупок. Введите 'stop', чтобы закончить");
        String input="";
        if(in.hasNextInt()) {
            person.putInBasket(in.nextInt());
        }
        else{
            input=in.nextLine();
            if(input.equals("show")){person.show();}
            else {
                person.putInBasket(input);
            }
        }
        while (!input.equals("stop")){
            if(in.hasNextInt()) {
                person.putInBasket(in.nextInt());
            }
            else{
                input=in.nextLine();
                if(input.equals("show")){person.show();}
                else {
                    person.putInBasket(input);
                }
            }
        }
    }
}
