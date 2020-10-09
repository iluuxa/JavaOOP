package ru.IShorin.JavaPracticeIshorin.lab7;

public class Chair extends Furniture {
    public Chair(double price, int id, String name) {
        super(price, id, name);
    }

    @Override
    public String getMaterial() {
        return "plastic";
    }
}
