package com.company;

public class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    public Shirt(String str) {
        String[] strings = str.split(",");
        if (strings.length < 4) {
            throw new IllegalArgumentException();
        }
        code = strings[0].trim();
        name = strings[1].trim();
        color = strings[2].trim();
        size = strings[3].trim();

    }

    public String getCod() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Shirt, code: " + code + '\n' +
                "name: " + name + '\n' +
                "color: " + color + '\n' +
                "size: " + size;
    }
}
