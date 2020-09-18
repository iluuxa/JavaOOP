package ru.IShorin.JavaPracticeIshorin;

public class Square extends Shape{
    double sidea;

    public double getSideA() {
        return sidea;
    }

    public void setSideA(double sidea) {
        this.sidea = sidea;
    }

    public Square(double side) {
        angles=4;
        sidea=side;
    }

    @Override
    public void calcArea() {
        area=sidea*sidea;
    }

    @Override
    public void calcPerimeter() {
        perimeter=sidea*4;
    }
}
