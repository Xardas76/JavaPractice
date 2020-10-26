package com.company;

import java.util.Scanner;

public class Exercise12 {
    public static void startSequence() {
        Scanner in = new Scanner(System.in);
        int next = in.nextInt();
        if (next == 0) {
            return;
        }
        if (next % 2 > 0) {
            System.out.println(next);
        }
        startSequence();
    }
}
