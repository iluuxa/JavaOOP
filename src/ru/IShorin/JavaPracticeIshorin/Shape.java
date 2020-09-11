package ru.IShorin.JavaPracticeIshorin;

public class Shape {
    String name;
    int numberOfAngles;
    double Perimeter;

    public Shape(String name, int numberOfAngles, double perimeter) {
        this.name = name;
        this.numberOfAngles = numberOfAngles;
        Perimeter = perimeter;
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
        return Perimeter;
    }

    public void setPerimeter(double perimeter) {
        Perimeter = perimeter;
    }
}
