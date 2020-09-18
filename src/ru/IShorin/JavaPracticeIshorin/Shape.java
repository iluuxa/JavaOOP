package ru.IShorin.JavaPracticeIshorin;

public abstract class Shape {
    int angles;
    double area;
    double perimeter;
    abstract public void calcArea();
    abstract public void calcPerimeter();

    public int getAngles() {
        return angles;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
