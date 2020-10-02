package ru.IShorin.JavaPracticeIshorin;

public class Chair extends Furniture {
    public Chair(double price, int id, String name) {
        super(price, id, name);
        material = "plastic";
    }
}
