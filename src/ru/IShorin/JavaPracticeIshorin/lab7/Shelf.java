package ru.IShorin.JavaPracticeIshorin.lab7;

public class Shelf extends Furniture{

    public Shelf(double price, int id, String name) {
        super(price, id, name);
    }

    @Override
    public String getMaterial() {
        return "metal";
    }
}
