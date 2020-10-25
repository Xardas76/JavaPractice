package com.company;

public class Main {

    public static void main(String[] args) {
        Dog[] pets = new Dog[3];
        Dog bobik = new Dog("Bobik", 3);
        Dog sharik = new Dog("Sharik");
        sharik.setAge(11);
        pets[0] = bobik;
        pets[1] = sharik;
        pets[2] = new Dog("Barbos", 7);
        for (Dog d: pets){
            System.out.println(d);
        }
        sharik.printHumanAge();

        System.out.println("\n\n");

        Ball white_ball = new Ball("football", "Nike", 21);
        Ball red_ball = new Ball(23);
        red_ball.setPurpose("basketball");
        System.out.println(red_ball.getPurpose());
        System.out.println(red_ball.getManufacturer());
        System.out.println(white_ball);

        System.out.println("\n\n");

        Book[] bookShelf = new Book[3];
        Book iliad = new Book("Iliad", "Homer");
        Book odyssey = new Book("Odyssey", "Homer", -800, "poem");
        iliad.setGenre("poem");
        bookShelf[0] = iliad;
        bookShelf[1] = odyssey;
        bookShelf[2] = new Book();
        bookShelf[2].setYear(2020);
        for (Book b: bookShelf){
            System.out.println(b);
        }
        odyssey.printAge();
        bookShelf[2].printAge();
    }
}
