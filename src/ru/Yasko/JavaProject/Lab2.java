package ru.Yasko.JavaProject;

import java.util.Scanner;

public class Lab2 {
    public static void run(){
        Scanner in=new Scanner(System.in);
        Shape triangle=new Shape("triangle",3,20,100);
        Shape circle = new Shape("circle",0,15,70);
        ShapeTester.displayInfo(circle);
        ShapeTester.displayInfo(triangle);
        ПитомникСобак питомникСобак= new ПитомникСобак();
        String name;
        int age;
        for (int i=0;i<5;i++) {
            name = in.next();
            age = in.nextInt();
            питомникСобак.addDog(new Dog(name,age));
        }
        питомникСобак.DisplayDogsInfo();
    }

    public static class Dog {
        private String name;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public int toHumanYears(){
            return (this.age*7);
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static class Shape {
        String name;
        int numberOfAngles;
        double perimeter;
        double square;

        public double getSquare() {
            return square;
        }

        public void setSquare(double square) {
            this.square = square;
        }

        public Shape(String name, int numberOfAngles, double perimeter, double square) {
            this.name = name;
            this.numberOfAngles = numberOfAngles;
            this.perimeter = perimeter;
            this.square=square;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumberOfAngles() {
            return numberOfAngles;
        }

        public void setNumberOfAngles(int numberOfAngles) {
            this.numberOfAngles = numberOfAngles;
        }

        public double getPerimeter() {
            return perimeter;
        }

        public void setPerimeter(double perimeter) {
            this.perimeter = perimeter;
        }
    }

    public static class ShapeTester {
        public ShapeTester() {
        }

        public static void displayInfo(Shape x){
            System.out.println("Фигура: "+x.getName()+ "\n Количество углов: "+x.getNumberOfAngles()+ "\nПериметр: "+x.getPerimeter()+ "\nПлощадь: "+x.getSquare());
        }
    }

    public static class ПитомникСобак {
        private Dog[] dogs=new Dog[0];

        public ПитомникСобак(Dog[] dogs) {
            this.dogs = dogs;
        }

        public ПитомникСобак() {
        }

        public Dog[] getDogs() {
            return dogs;
        }

        public void setDogs(Dog[] dogs) {
            this.dogs = dogs;
        }
        public void setDog(int i, Dog dog){
            dogs[i]=dog;
        }
        public Dog getDog(int i){
            return dogs[i];
        }
        public void DisplayDogInfo(int i){
            System.out.println("Кличка: "+dogs[i].getName()+"\nВозраст: "+dogs[i].getAge()+"   В человеческих: "+dogs[i].toHumanYears()+"\n");
        }
        public void DisplayDogsInfo(){
            for(int i=0;i< dogs.length;i++){
                System.out.println("Кличка: "+dogs[i].getName()+"\nВозраст: "+dogs[i].getAge()+"   В человеческих: "+dogs[i].toHumanYears()+"\n");
            }
        }

        public void addDog(Dog dog){
            Dog[] dogs1=new Dog[dogs.length+1];
            for(int i=0;i< dogs.length;i++)
            {
                dogs1[i]=dogs[i];
            }
            dogs1[dogs.length]=dog;
            dogs=dogs1;
        }
    }
}
