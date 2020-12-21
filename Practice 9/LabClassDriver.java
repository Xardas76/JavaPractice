package com.company;

public class LabClassDriver {
    private Student[] students;

    LabClassDriver() {

    }

    public void printStudents() {
        if (students == null) {
            System.out.println("Список пуст");
        }
        for (Student s: students) {
            System.out.println(s.toString());
        }
    }

    public void generateStudents() {
        int grade;
        String name;

        students = new Student[20];
        for (int i = 0; i < 20; i++) {
            grade = (int)(Math.random()*1000)%5;
            if (grade < 2) grade+=3;
            name = String.valueOf((char) ('a'+i));
            students[i] = new Student(name, grade);
        }
    }

    public void sort () {
        insertionSort(students);
    }

    public String search (String name) {
        try {
            for (Student s: students) {
                if (s.getName().equals(name))
                    return s.toString();
            }
            throw new StudentNotFoundException();
        } catch (StudentNotFoundException e) {
            return e.getMessage();
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
