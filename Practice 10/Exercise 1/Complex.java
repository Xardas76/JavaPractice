package com.company;

public class Complex {
    private int real, image;

    public Complex() {
        real = 0;
        image = 0;
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public int getImage() {
        return image;
    }
}
