package ru.IShorin.JavaPracticeIshorin;

public class Circle{
    private double radius;
    private double square;
    private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
        perimeter=2*Math.PI*radius;
        square=Math.PI*radius*radius;
    }

    public Circle(double radius, double square, double perimeter) {
        this.radius = radius;
        this.square = square;
        this.perimeter = perimeter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
