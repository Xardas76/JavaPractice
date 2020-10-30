package com.company;

public class GameEngine {
    private int moves;
    private Deck deck1;
    private Deck deck2;

    public GameEngine(int deckMode) {
        moves = 0;
        switch (deckMode) {
            case 1 -> {
                deck1 = new DeckOnStack();
                deck2 = new DeckOnStack();
            }
            case 2 -> {
                deck1 = new DeckOnQueue();
                deck2 = new DeckOnQueue();
            }
            case 3 -> {
                deck1 = new DeckOnDeque();
                deck2 = new DeckOnDeque();
            }
        }
    }

    public void addDecks(int[] d1, int[] d2) {
        deck1.addAll(d1);
        deck2.addAll(d2);
    }

    public int[] nextMove() {
        moves++;
        if (moves > 105) {
            return new int[1];
        }
        int winner;
        int card1 = deck1.getFromTop();
        int card2 = deck2.getFromTop();

        if (card1 > card2 && card2!=0) {
            winner = 1;
        }
        else if (card2==0 && card1==9) {
            winner = 2;
        }
        else if (card1==0 && card2==9) {
            winner = 1;
        }
        else if (card1 == card2) { //Added  rule, that if cards are equal, they go on each player's deck's bottom
            winner = 0;
        }
        else {
            winner = 2;
        }
        int[] ans = new int[3];
        ans[0] = winner;
        ans[1] = card1;
        ans[2] = card2;

        if (winner == 1) {
            deck1.addTwoOnBottom(card1, card2);
            if (deck2.isEmpty()) {
                ans[0] = moves*10;
            }
        }
        else if (winner == 2){
            deck2.addTwoOnBottom(card1, card2);
            if (deck1.isEmpty()) {
                ans[0] = moves*10000;
            }
        }
        else { //Added  rule, that if cards are equal, they go on each player's deck's bottom
            deck1.addOneOnBottom(card2);
            deck2.addOneOnBottom(card1);
        }

        return ans;
    }
}
