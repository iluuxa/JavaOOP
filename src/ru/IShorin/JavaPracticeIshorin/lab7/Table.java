package ru.IShorin.JavaPracticeIshorin.lab7;

public class Table extends Furniture{

    public Table(double price, int id, String name) {
        super(price, id, name);
    }

    @Override
    public String getMaterial() {
        return "wood";
    }
}
