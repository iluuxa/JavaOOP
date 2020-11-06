package ru.Yasko.JavaProject.Lab13;

public class Student {
    private int IDNumber;
    private int gpa;

    public Student(int IDNumber, int gpa) {
        this.IDNumber = IDNumber;
        this.gpa = gpa;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
