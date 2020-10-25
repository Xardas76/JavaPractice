package com.company;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog() {
        this.name = "Unknown";
        this.age = 0;
    }

    public void rename(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(String name) {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return this.name + ", age: " + this.age;
    }

    public void printHumanAge() {
        System.out.println(name + "'s age in human years is " + age * 7);
    }
}