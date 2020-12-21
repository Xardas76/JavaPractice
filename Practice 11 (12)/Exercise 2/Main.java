package com.company;

public class Main {

    static public void main(String[] args){
        Address1 a1 = new Address1("Россия, Москва, Москва, ул. Пушкина, д. Колотушкина, , 322");
        Address2 a2 = new Address2("Россия, Ленинград; Санкт-Петербург; пр. Невского: 228; 14, 88");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
