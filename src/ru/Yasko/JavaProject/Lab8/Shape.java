package ru.Yasko.JavaProject.Lab8;

public abstract class Shape {
    int angles;
    double area;
    double perimeter;
    int[] color= new int[3];
    int x;
    int y;

    public Shape() {
    }

    public Shape(int h, int s, int b, int x, int y) {
        color[0]=h;
        color[1]=s;
        color[2]=b;
        this.x = x;
        this.y = y;
    }

    public int[] getColor() {
        return color;
    }

    public void setColor(int[] color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

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
