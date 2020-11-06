package ru.Yasko.JavaProject.Lab13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab13 {
    List<Student> students=new ArrayList<>();
    public void run(){
        Scanner in = new Scanner(System.in);
        Student student;
        int id=-1;
        long time;
        int gpa;
        System.out.println("Введите студентов. Введите 'stop', чтобы закончить\nВведите id:");
        while (in.hasNextInt()){
            if(id!=-1){
                gpa=in.nextInt();
                student = new Student(id,gpa);
                id=-1;
                students.add(student);
                System.out.println("Введите id: ");
            }
            else{id = in.nextInt();
                System.out.println("Введите средний балл: ");
            }
        }
        in.next();
        System.out.println("Выберите желаемое действие:\n1 - вывод списка студентов, отсортированного по ID\n2 - вывод списка студентов, отсортированного по среднему баллу\n3 - бинарный поиск студента по ID\n4 - линейный поиск студента по ID\n5 - добавить в список n случайных студентов\n6 - завершение работы программы");
        int sw=in.nextInt();
        while (sw!=6) {
            switch (sw) {
                case 1:
                    time = System.nanoTime();
                    quickSort(0, students.size() - 1);
                    time = System.nanoTime() - time;
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(students.get(i).getIDNumber() + "      " + students.get(i).getGpa());
                    }
                    System.out.printf("Время работы: %,9.3f ms\n", time/1_000_000.0);
                    break;
                case 2:
                    time = System.nanoTime();
                    SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA(students);
                    students = sortingStudentsByGPA.getStudents();
                    time = System.nanoTime() - time;
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(students.get(i).getIDNumber() + "      " + students.get(i).getGpa());
                    }
                    System.out.printf("Время работы: %,9.3f ms\n", time/1_000_000.0);
                    break;
                case 3:
                    System.out.println("Введите id:");
                    id = in.nextInt();
                    quickSort(0, students.size()- 1);
                    time = System.nanoTime();
                    student=searchBinary(id,0, students.size()-1);
                    time = System.nanoTime() - time;
                    System.out.printf("Время работы: %,9.3f ms\n", time/1_000_000.0);

                    if(student==null){System.out.println("Студент не найден.");}
                    else{
                        System.out.println("ID: "+student.getIDNumber()+"    Средний балл: "+student.getGpa());}
                    break;
                case 4:
                    System.out.println("Введите id:");
                    id = in.nextInt();
                    time = System.nanoTime();
                    student=searchLinear(id);
                    time = System.nanoTime() - time;
                    System.out.printf("Время работы: %,9.3f ms\n", time/1_000_000.0);
                    if(student==null){System.out.println("Студент не найден ");}
                    else{
                        System.out.println("ID: "+student.getIDNumber()+"    Средний балл: "+student.getGpa());
                    }
                    break;
                case 5:
                    System.out.println("Введите n:");
                    id = in.nextInt();
                    for(int i=0;i<id;i++){
                        students.add(new Student((int)(Math.random()*Integer.MAX_VALUE),(int)(Math.random()*5+1)));
                    }
            }
            sw=in.nextInt();
        }
    }

    public void quickSort(int low, int high) {
        if (students.size()== 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora = students.get(middle);
        int i = low, j = high;
        while (i <= j){
            while (students.get(i).getIDNumber() < opora.getIDNumber()) {
                i++;
            }
            while (students.get(j).getIDNumber() > opora.getIDNumber()) {
                j--;
            }
            if (i <= j) {
                Student temp = students.get(i);
                students.set(i,students.get(j));
                students.set(j,temp);
                i++;
                j--;
            }
        }
        if (low < j) {quickSort(low, j);}
        if (high > i) {quickSort(i, high);}
    }

    public Student searchLinear(int id){
        for(int i=0;i<students.size();i++){
            if (students.get(i).getIDNumber()==id){
                return students.get(i);
            }
        }
        return null;
    }

    public Student searchBinary(int id, int l, int r){

        int cur = (l+r)/2;
        if (id==students.get(cur).getIDNumber()){
            return students.get(cur);
        }
        else{
            if(r-l==1){
                if(id==students.get(r).getIDNumber()){
                    return students.get(r);
                }
                else{
                    return null;
                }
            }
            if (id<students.get(cur).getIDNumber()){
                return searchBinary(id,l,cur);
            }
            else{
                return searchBinary(id,cur,r);
            }
        }
    }

    public Student searchBinaryIt(int id){
        int l=0; int r = students.size()-1;
        while(r-l>1){
            if(id==students.get((r-l)/2).getIDNumber()){return students.get(r-l/2);}
            else{
                if(id>students.get((r-l)/2).getIDNumber()){
                    l=(r-l)/2;
                }
                else{r=(r-l)/2;}
            }
        }
        if(id==students.get(r).getIDNumber()){return students.get(r);}
        if(id==students.get(l).getIDNumber()){return students.get(l);}
        return null;
    }

    public Student searchLinearRec(int id,int i){
        if(i>=students.size()){return null;}
        else{
            if(id==students.get(i).getIDNumber()){return students.get(i);}
            else{return searchLinearRec(id,i+1);}
        }
    }
}
