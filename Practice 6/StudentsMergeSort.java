package com.company;

public class StudentsMergeSort {
    private int STUDENTS_SIZE = 15;

    private Student[] students1;
    private Student[] students2;
    private Student[] studentsMerged;

    StudentsMergeSort() {
        int id;
        String name;

        students1 = new Student[STUDENTS_SIZE];
        for (int i = 0; i < STUDENTS_SIZE; i++) {
            id = (int)(Math.random()*10000);
            name = "1" + String.valueOf((char) ('a'+i));
            students1[i] = new Student(name, id);
        }

        students2 = new Student[STUDENTS_SIZE];
        for (int i = 0; i < STUDENTS_SIZE; i++) {
            id = (int)(Math.random()*10000);
            name = "2" + String.valueOf((char) ('a'+i));
            students2[i] = new Student(name, id);
        }

        studentsMerged = new Student[2*STUDENTS_SIZE];
        mergesort(students1, 0, STUDENTS_SIZE-1);
        mergesort(students2, 0, STUDENTS_SIZE-1);
        mergeTwoInOne(students1, students2, studentsMerged);

        for (Student s: studentsMerged) {
            System.out.println(s);
        }
    }

    private void merge(Comparable[] items, int start, int mid, int end) {
        Comparable[] temp = new Comparable[items.length];
        int pos1 = start;
        int pos2 = mid + 1;
        int spot = start;

        while (!(pos1 > mid && pos2 > end)) {
            if ((pos1 > mid) || (pos2 <= end) && (items[pos2].compareTo(items[pos1]) > 0)) {
                temp[spot] = items[pos2];
                pos2 += 1;
            } else {
                temp[spot] = items[pos1];
                pos1 += 1;
            }
            spot += 1;
        }
        for (int i = start; i <= end; i++) {
            items[i] = temp[i];
        }
    }

    public void mergesort(Comparable[] items, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(items, start, mid);
            mergesort(items, mid + 1, end);
            merge(items, start, mid, end);
        }
    }

    private void mergeTwoInOne(Comparable[] a, Comparable[] b, Comparable[] result) {
        int c1 = 0, c2 = 0, c = 0; //indexes of a, b and result
        while (c1 < STUDENTS_SIZE && c2 < STUDENTS_SIZE) {
            if (a[c1].compareTo(b[c2]) > 0) {
                result[c] = a[c1];
                c1++;
            } else {
                result[c] = b[c2];
                c2++;
            }
            c++;
        }
        for (;c1 < STUDENTS_SIZE; c1++) {
            result[c] = a[c1];
        }
        for (;c2 < STUDENTS_SIZE; c2++) {
            result[c] = b[c1];
        }
    }
}
