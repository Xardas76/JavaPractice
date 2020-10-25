package com.company;

public class Book {
    private String name;
    private String author;
    private int year;
    private String genre;

    public Book(String name, String author, int year, String genre) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    public Book(String name) {
        this.name = name;
        author = "Unknown";
        year = 2020;
        genre = "unknown";
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        year = 2020;
        genre = "unknown";
    }

    public Book() {
        this.name = "Unknown";
        author = "Unknown";
        year = 2020;
        genre = "unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return  genre + ": " + name + " by " +
                author + ", published in " + year;
    }

    public void printAge() {
        if (year == 2020) {
            System.out.println(name + " was published in this year");
            return;
        }
        System.out.println(name + " was published " + (2020-year) + " years ago");
    }
}
