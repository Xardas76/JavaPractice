package com.company;

class Person {
    private String name;
    private String surname;
    private String father_name;

    public Person(String surname, String name, String father_name) {
        this.name = name;
        this.surname = surname;
        this.father_name = father_name;
    }

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname, String name) {
        this.name = name;
        this.surname = surname;
    }

    public String getFIO() {
        if (name == null && father_name == null) {
            return surname;
        }
        else if (father_name == null) {
            return new StringBuilder(surname)
                    .append(" ")
                    .append(name.charAt(0))
                    .append(".")
                    .toString();
        }
        return new StringBuilder(surname)
                .append(" ")
                .append(name.charAt(0))
                .append(".")
                .append(father_name.charAt(0))
                .append(".")
                .toString();
    }
}
