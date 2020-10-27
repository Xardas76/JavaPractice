package com.company;

public class Student implements Comparable {
    private int id;
    private String name;

    @Override
    public int compareTo(Object o) {
        int param_id = ((Student)o).getId();
        if (param_id > this.id) {
            return 1;
        }
        else if (param_id == this.id) {
            return 0;
        } else {
            return -1;
        }
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
