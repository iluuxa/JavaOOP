package ru.Yasko.JavaProject.lab12;

import static java.lang.Math.pow;

public enum Planet {
    Mercury(330.1,2439.7),
    Venus(4867.5,6051.8),
    Earth(5972.4,6371),
    Mars(641.7,3389.5),
    Jupiter(1898200,69911),
    Saturn(568340,58232),
    Uranus(86813,25362),
    Neptune(102413,24622);
    double mass;
    double radius;
    double gravity;

    public double getGravity() {
        return ((double) (Math.round(gravity * 100))) / 100;
    }

    Planet(double mass, double radius){
        this.mass=mass;
        this.radius=radius;
        gravity=mass*pow(10,4)*6.67430/(radius*radius);
    }
}
