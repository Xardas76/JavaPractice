package com.company;

public class StudentGPA extends Student{
    private double GPA;

    @Override
    public int compareTo(Object o) {
        double param_gpa = ((com.company.StudentGPA)o).getGPA();
        if (param_gpa > this.GPA) {
            return 1;
        }
        else if (param_gpa == this.GPA) {
            return 0;
        } else {
            return -1;
        }
    }

    public StudentGPA(String name, int id, double gpa) {
        super(name, id);
        this.GPA = gpa;
    }

    @Override
    public String toString() {

        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                "GPA=" + GPA +
                '}';
    }

    public double getGPA() {
        return GPA;
    }
}
