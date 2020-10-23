package ru.Yasko.JavaProject.Lab13;

import java.util.Scanner;

public class Lab13 {
    public static void run(){
        Scanner in = new Scanner(System.in);
        Student[] students=new Student[0];
        Student[] temp;
        Student student;
        int IDNumber[];
        int id=-1;
        int gpa=-1;
        System.out.println("Введите студентов. Введите 'stop', чтобы закончить\nВведите id:");
        while (in.hasNextInt()){
            if(id!=-1){
                gpa=in.nextInt();
                student = new Student(id,gpa);
                id=-1;
                temp = new Student[students.length+1];
                for(int i=0;i<students.length;i++){
                    temp[i]=students[i];
                }
                temp[students.length]=student;
                students=temp;
            }
            else{id = in.nextInt();}
        }
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA(students);
        students=sortingStudentsByGPA.getStudents();
        for (int i=0;i<students.length;i++){
            System.out.println(students[i].getId()+"      "+students[i].getGpa());
        }
    }
}
