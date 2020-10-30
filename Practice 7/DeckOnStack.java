package com.company;

import java.util.*;

public class DeckOnStack extends Deck {
    private Stack<Integer> stack;

    DeckOnStack() {
        stack = new Stack<>();
    }
    @Override
    public void addAll(int[] a) {
        ArrayList<Integer> array = new ArrayList<>();
        for (Integer i: a){
            array.add(i);
        }
        stack.addAll(array);
    }

    @Override
    public void addOnTop(int card) {
        stack.add(card);
    }

    @Override
    public void addTwoOnBottom(int card1, int card2) {
        stack.add(0, card1);
        stack.add(0, card2);
    }

    @Override
    public int getFromTop() {
        return stack.pop();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void addOneOnBottom(int card) {
        stack.add(0, card);
    }
}
