package ru.Yasko.JavaProject.Lab13;

import java.util.List;
import java.util.SplittableRandom;

public class SortingStudentsByGPA implements Comparator{
    private List<Student> students;

    public SortingStudentsByGPA(List<Student> students) {
        this.students = students;
        MergeSort(0,students.size()-1);
        quickSort(0,students.size()-1);
    }

    public List<Student> getStudents() {
        return students;
    }
    @Override
    public int compare(Student first, Student second) {
        return (first.getGpa()-second.getGpa());
    }

    public void MergeSort(int p, int r) {
        int q;
        if (p < r) {
            q =((p + r)/2);
            MergeSort( p, q);
            MergeSort(q+1, r);
            Merge(p, q, r);
        }
    }
    public void Merge(int p, int q, int r) {
        int i; int j; int k;
        int n1 = q - p+1;
        int n2 = r - q;
        Student[] L = new Student[n1];
        Student[] R = new Student[n2];
        for (i = 0; i < n1; i++) { L[i] = students.get(p + i); }
        for (j = 0; j < n2; j++) { R[j] = students.get(q + j+1); }
        i = 0; j = 0;
        for (k = p; k <= r; k++) {
            if ((i < n1) && (j < n2)) {
                if (compare(L[i],R[j])<=0) { students.set(k,L[i]); i++; }
                else { students.set(k,R[j]); j++;}
            }
            else {
                if (i < n1) { students.set(k,L[i]); i++; }
                if (j < n2) { students.set(k,R[j]); j++; }
            }
        }
    }

    public void quickSort(int low, int high) {
        if (students.size() == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora = students.get(middle);
        int i = low, j = high;
        while (i <= j){
            while (compare(students.get(i), opora) > 0) {
                i++;
            }
            while (compare(students.get(j), opora) < 0) {
                j--;
            }
            if (i <= j) {
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j,temp);
                i++;
                j--;
            }
        }
        if (low < j) {quickSort(low, j);}
        if (high > i) {quickSort(i, high);}
    }
}
