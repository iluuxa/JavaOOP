package ru.IShorin.JavaPracticeIshorin;

public class Lab5 {
    public static void run(){
        Circle circle=new Circle(5);
        circle.calcArea();
        circle.calcPerimeter();
        Rectangle rectangle= new Rectangle(10,20);
        rectangle.calcArea();
        rectangle.calcPerimeter();
        Square square=new Square(8.5);
        square.calcArea();
        square.calcPerimeter();
        System.out.println("Радиус круга: "+circle.getRadius()+"  Периметр: "+circle.getPerimeter()+"  Площадь: "+circle.getArea()+"\n"
                +"Сторона квадрата: "+square.getSideA()+"  Периметр: "+square.getPerimeter()+"  Площадь: "+square.getArea()+"\n"
                +"Сторона прямоугольника 1: "+rectangle.getSideA()+"  Сторона прямоугольника 2: "+rectangle.getSideB()+"  Периметр: "+rectangle.getPerimeter()+"  Площадь: "+rectangle.getArea()+"\n");
    }
}
