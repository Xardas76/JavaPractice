package com.company;

import java.io.File;
import java.util.Scanner;

public class INN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите ИНН");
            String inn = in.next();
            if (inn.length()!=10)
                throw new IncorrectINNException();
            System.out.println("ИНН получен");
        } catch (IncorrectINNException e) {
            System.out.println(e.getMessage());
        }
    }
}
