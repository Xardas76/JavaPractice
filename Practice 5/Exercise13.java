package com.company;

import java.util.Scanner;

public class Exercise13 {
    public static void startSequence() {
        Scanner in = new Scanner(System.in);
        int next = in.nextInt();
        if (next == 0) {
            return;
        }
        System.out.println(next);
        next = in.nextInt();
        if (next == 0) {
            return;
        }
        startSequence();
    }
}
