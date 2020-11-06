package ru.Yasko.JavaProject.Lab15;

import java.util.Scanner;

public class Lab15 {
    public static void run(){
        Collection a=new Collection();
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество случайно сгенерированных элементов:");
        n=in.nextInt();
        for (int i=0;i<n;i++){
            a.addElement((int)((Integer.MAX_VALUE/2 - Math.random()*Integer.MAX_VALUE)*2));
        }

        System.out.println("1 - Добавить элемент\n2 - Удалить элемент по индексу\n3 - Поиск по индексу\n4 - поиск по значению\n5 - найти минимальный элемент\n6 - найти максимальный элемент\n7 - Посчитать среднее арифметическое\n8 - отобразить элементы");
        int sw=in.nextInt();
        while(sw!=0){
            switch (sw){
                case 1:
                    a.addElement(in.nextInt());
                    break;
                case 2:
                    a.deleteElement(in.nextInt());
                    break;
                case 3:
                    n=in.nextInt();
                    if((n<a.getLength())&&(n>=0)){
                        System.out.println("Значение элемента: "+a.indexSearch(n));
                    }
                    else {
                        System.out.println("Некорректный индекс");
                    }
                    break;
                case 4:
                    n=a.dataSearch(in.nextInt());
                    if(n!=-1){
                        System.out.println("Индекс элемента: "+n);
                    }
                    else {
                        System.out.println("Нет элемента с этим значением");
                    }
                    break;
                case 5:
                    System.out.println(a.minSearch());
                    break;
                case 6:
                    System.out.println(a.maxSearch());
                    break;
                case 7:
                    System.out.println("Среднее арифметическое: "+a.averageCount());
                    break;
            }
            System.out.println("Введите следующее действие: ");
            sw=in.nextInt();
        }
    }
}
