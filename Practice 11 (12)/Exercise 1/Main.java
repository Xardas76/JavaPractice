package com.company;

public class Main {

    static public void main(String[] args){
        System.out.println(new Person("Клеопатра").getFIO());
        System.out.println(new Person("Маск","Илон").getFIO());
        System.out.println(new Person("Дьяченко", "Иван","Олегович").getFIO());
    }
}
