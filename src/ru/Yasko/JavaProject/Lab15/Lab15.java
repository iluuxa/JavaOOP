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

        ColElem temp;
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
                    temp = a.indexSearch(in.nextInt());
                    if(temp!=null){
                        System.out.println("Индекс: "+temp.getIndex()+"    Значение: "+temp.getData());
                    }
                    else{
                        System.out.println("Элемент не найден");
                    }
                    break;
                case 4:
                    temp = a.dataSearch(in.nextInt());
                    if(temp!=null){
                        System.out.println("Индекс: "+temp.getIndex()+"    Значение: "+temp.getData());
                    }
                    else{
                        System.out.println("Элемент не найден");
                    }
                    break;
                case 5:
                    temp = a.minSearch();
                    if(temp!=null){
                        System.out.println("Индекс: "+temp.getIndex()+"    Значение: "+temp.getData());
                    }
                    else{
                        System.out.println("Элемент не найден");
                    }
                    break;
                case 6:
                    temp = a.maxSearch();
                    if(temp!=null){
                        System.out.println("Индекс: "+temp.getIndex()+"    Значение: "+temp.getData());
                    }
                    else{
                        System.out.println("Элемент не найден");
                    }
                    break;
                case 7:
                    System.out.println("Среднее арифметическое: "+a.averageCount());
                    break;
                case 8:
                    for(int i=0;i<a.getLength();i++){
                        temp=a.indexSearch(i);
                        System.out.println(temp.getIndex()+"    "+ temp.getData());
                    }
            }
            System.out.println("Введите следующее действие: ");
            sw=in.nextInt();
        }
    }
}
