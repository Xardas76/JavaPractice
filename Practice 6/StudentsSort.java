package com.company;

public class StudentsSort {
    private Student[] students;

    StudentsSort() {
        int id;
        String name;

        students = new Student[20];
        for (int i = 0; i < 20; i++) {
            id = (int)(Math.random()*10000);
            name = String.valueOf((char) ('a'+i));
            students[i] = new Student(name, id);
        }

        insertionSort(students);

        for (Student s: students) {
            System.out.println(s);
        }
    }

    private void insertionSort(Comparable[] a) {
        int N = a.length;

        for (int i = 1; i < N; i++) {
            for ( int j = i; j > 0 && ( (a[j].compareTo( a[j-1]))< 0 ); j--)
            {
                Comparable temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }
    }
}
