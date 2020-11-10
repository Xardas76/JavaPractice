package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static FileWriter writer;
    static FileReader reader;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("How can I help you?\n" +
                "1) Write text to file\n" +
                "2) Read file\n" +
                "3) Rewrite text to file\n" +
                "4) Add text to file");
        int command;
        while ((command = Integer.parseInt(in.nextLine())) != 0) {
            switch (command) {
                case 1:
                case 4:
                    writer = new FileWriter("C:\\Users\\Owner\\Documents\\test.txt", true);
                    String str = in.nextLine();
                    writer.write(str);
                    writer.close();
                    break;
                case 2:
                    reader = new FileReader("C:\\Users\\Owner\\Documents\\test.txt");
                    int c;
                    while ((c = reader.read()) != -1) {
                        System.out.print((char) c);
                    }
                    System.out.print("\n");
                    break;
                case 3:
                    writer = new FileWriter("C:\\Users\\Owner\\Documents\\test.txt", false);
                    writer.write(in.nextLine());
                    writer.close();
                    break;
            }
        }
    }
}
