package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class DeckOnDeque extends Deck {
    Deque<Integer> deque;

    DeckOnDeque() { deque = new ArrayDeque<>();}
    @Override
    public void addAll(int[] a) {
        ArrayList<Integer> array = new ArrayList<>();
        for (Integer i: a){
            array.add(i);
        }
        deque.addAll(array);
    }

    @Override
    public void addOnTop(int card) {
        deque.add(card);
    }

    @Override
    public void addTwoOnBottom(int card1, int card2) {
        deque.add(card1);
        deque.add(card2);
    }

    @Override
    public int getFromTop() {
        return deque.pop();
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public void addOneOnBottom(int card) {
        deque.addFirst(card);
    }
}
