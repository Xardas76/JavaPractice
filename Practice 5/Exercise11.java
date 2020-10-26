package com.company;

import java.util.Scanner;

public class Exercise11 {
    public static int startSequence() {
        Scanner in = new Scanner(System.in);
        int next = in.nextInt();
        if (next == 0) {
            next = in.nextInt();
            if (next == 0) {
                return 0;
            }
        }
        if (next == 1) {
            return 1 + startSequence();
        }
        return startSequence();
    }
}
