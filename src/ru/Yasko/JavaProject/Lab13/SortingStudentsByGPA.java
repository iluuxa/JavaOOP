package ru.Yasko.JavaProject.Lab13;

import java.util.SplittableRandom;

public class SortingStudentsByGPA implements Comparator{
    private Student[] students;

    public SortingStudentsByGPA(Student[] students) {
        this.students = students;
        MergeSort(0,students.length-1);
        quickSort(0,students.length-1);
    }

    public Student[] getStudents() {
        return students;
    }

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
        for (i = 0; i < n1; i++) { L[i] = students[p + i]; }
        for (j = 0; j < n2; j++) { R[j] = students[q + j+1]; }
        i = 0; j = 0;
        for (k = p; k <= r; k++) {
            if ((i < n1) && (j < n2)) {
                if (compare(L[i],R[j])<=0) { students[k] = L[i]; i++; }
                else { students[k] = R[j]; j++;}
            }
            else {
                if (i < n1) { students[k] = L[i]; i++; }
                if (j < n2) { students[k] = R[j]; j++; }
            }
        }
    }

    public void quickSort(int low, int high) {
        if (students.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora = students[middle];
        int i = low, j = high;
        while (i <= j){
            while (compare(students[i], opora) < 0) {
                i++;
            }
            while (compare(students[j], opora) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {quickSort(low, j);}
        if (high > i) {quickSort(i, high);}
    }
}
