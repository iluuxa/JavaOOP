package ru.IShorin.JavaPracticeIshorin;

public class Circle extends Shape {
    double radius;

    public Circle(int radius) {
        angles=0;
        this.radius=radius;
    }

    @Override
    public void calcArea() {
        area=radius*radius*Math.PI;
    }

    @Override
    public void calcPerimeter() {
        perimeter=2*radius*Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
