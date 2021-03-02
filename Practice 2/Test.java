package com.company;

public class Test {

    public static void main(String[] args) {
        System.out.println("Yes, we start tests now");
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);

        Author a1 = new Author("Лев Толстой", "inbox@tolstoy.ru",'m');
        System.out.println(a1);
    }
}
