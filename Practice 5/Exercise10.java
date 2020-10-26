package com.company;

public class Exercise10 {

    public static int flipInt(int n) {
        return recurse(n, countLength(n));
    }

    private static int countLength(int k) {
        if (k > 0) {
            k /= 10;
            return 1 + countLength(k);
        }
        return 0;
    }

    private static int recurse(int n, int length) {
        if (n < 10) {
            return n;
        }
        else {
            length--;
            return (n%10) * (int)Math.pow(10, length) + recurse(n/10, length);
        }
    }
}
