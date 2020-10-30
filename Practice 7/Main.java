package com.company;

import java.util.Scanner;

public class Main {
    public final static int DECK_SIZE = 5;
    public static int deckMode;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose the way to create deck:\n" +
                "1) Stack\n" +
                "2) Queue\n" +
                "3) Deque");
        deckMode = in.nextInt();

        System.out.println("Enter '1' to open interactive interface. Or enter anything else to proceed in console.");
        if (in.nextInt() == 1) {
            new Window().setVisible(true);
            return;
        }

        int[] d1 = new int[DECK_SIZE];
        int[] d2 = new int[DECK_SIZE];
        for (int i = 0; i < DECK_SIZE; i++) {
            d1[i] = in.nextInt();
        }
        for (int i = 0; i < DECK_SIZE; i++) {
            d2[i] = in.nextInt();
        }
        GameEngine game = new GameEngine(deckMode);
        game.addDecks(d1, d2);
        int[] lastMove = new int[1];
        lastMove[0] = 0;

        while (lastMove[0] < 3) {
            lastMove = game.nextMove();
            if (lastMove.length == 1) {
                System.out.println("botva");
                break;
            }
            if (lastMove[0] > 9999) {
                System.out.println("second " + lastMove[0]/10000);
            }
            else if (lastMove[0] > 9) {
                System.out.println("first " + lastMove[0]/10);
            } else {
                System.out.println("Player 1 took " + lastMove[1] +
                        " and Player 2 took " + lastMove[2] +
                        ", so Player " + lastMove[0] + " is winner");
            }
        }
    }
}
