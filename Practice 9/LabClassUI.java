package com.company;

import java.util.Scanner;

public class LabClassUI {

    public static void main(String[] args) {
        LabClassDriver driver = new LabClassDriver();
        Scanner in = new Scanner(System.in);
        driver.generateStudents();
        driver.sort();
        driver.printStudents();
        try {
            System.out.println("Введите полное имя");
            String name = in.next();
            if (name.length() == 0) {
                throw new EmptyStringException();
            }
            System.out.println(driver.search(name));
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }

    }
}
