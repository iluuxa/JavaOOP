package ru.IShorin.JavaPracticeIshorin;

public class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String name, int year) {
        this.author = author;
        this.title = name;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
