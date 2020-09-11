package ru.IShorin.JavaPracticeIshorin;

public class BookTest {
    public static void main(String[] args) {
    }
    public static void displayInfo(Book book){
        System.out.println("\nАвтор: "+book.getAuthor()+"\nНазвание: "+book.getName()+"\nГод написания: "+book.getYear());
    }
}
