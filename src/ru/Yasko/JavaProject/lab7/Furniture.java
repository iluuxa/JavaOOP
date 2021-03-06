package ru.Yasko.JavaProject.lab7;

public abstract class Furniture {
    double price;
    int id;
    String name;



    public Furniture(double price, int id, String name) {
        this.price = price;
        this.id = id;
        this.name = name;
    }
    public abstract String getMaterial();
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
