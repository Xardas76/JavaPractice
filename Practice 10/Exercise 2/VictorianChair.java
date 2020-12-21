package com.company;

public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public VictorianChair() {
    }

    public VictorianChair(int age) {
        this.age = age;
    }
}
