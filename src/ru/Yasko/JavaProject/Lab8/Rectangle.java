package ru.Yasko.JavaProject.Lab8;

public class Rectangle extends Shape {
    double sidea;
    double sideb;

    public Rectangle(int h,int s, int b, int x, int y, double sidea, double sideb) {
        super(h, s, b, x, y);
        this.sidea = sidea;
        this.sideb = sideb;
    }

    public Rectangle(double sidea, double sideb) {
        angles=4;
        this.sidea = sidea;
        this.sideb = sideb;
    }

    @Override
    public void calcArea() {
        area=sidea*sideb;
    }

    @Override
    public void calcPerimeter() {
        perimeter=sidea*sideb*2;
    }

    public double getSideA() {
        return sidea;
    }

    public void setSideA(double sidea) {
        this.sidea = sidea;
    }

    public double getSideB() {
        return sideb;
    }

    public void setSideB(double sideb) {
        this.sideb = sideb;
    }
}
