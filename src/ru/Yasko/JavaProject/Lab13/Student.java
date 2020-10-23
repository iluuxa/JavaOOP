package ru.Yasko.JavaProject.Lab13;

public class Student {
    private int id;
    private int gpa;

    public Student(int id, int gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
