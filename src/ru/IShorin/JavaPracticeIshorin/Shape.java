package ru.IShorin.JavaPracticeIshorin;

public class Shape {
    String name;
    int numberOfAngles;
    double perimeter;
    double square;

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public Shape(String name, int numberOfAngles, double perimeter, double square) {
        this.name = name;
        this.numberOfAngles = numberOfAngles;
        this.perimeter = perimeter;
        this.square=square;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfAngles() {
        return numberOfAngles;
    }

    public void setNumberOfAngles(int numberOfAngles) {
        this.numberOfAngles = numberOfAngles;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
