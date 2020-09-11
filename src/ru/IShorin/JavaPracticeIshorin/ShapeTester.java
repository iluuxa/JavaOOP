package ru.IShorin.JavaPracticeIshorin;

public class ShapeTester {
    public ShapeTester() {
    }

    public static void displayInfo(Shape x){
        System.out.println("Фигура: "+x.getName()+ "\n Количество углов: "+x.getNumberOfAngles()+ "\nПериметр: "+x.getPerimeter()+ "\nПлощадь: "+x.getSquare());
    }
}
