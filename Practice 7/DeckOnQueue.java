package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DeckOnQueue extends Deck{
    private Queue<Integer> queue;

    DeckOnQueue() {
        queue = new LinkedList<>();
    }

    @Override
    public void addAll(int[] a) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = a.length-1; i >= 0; i--){
            array.add(a[i]);
        }
        queue.addAll(array);
    }

    @Override
    public void addOnTop(int card) {
        Queue<Integer> temp = new LinkedList<>();
        temp.add(card);
        temp.addAll(queue);
        queue.clear();
        queue = temp;
    }

    @Override
    public void addTwoOnBottom(int card1, int card2) {
        queue.add(card1);
        queue.add(card2);
    }

    @Override
    public int getFromTop() {
        if (!queue.isEmpty()) {
            return queue.poll();
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void addOneOnBottom(int card) {
        queue.add(card);
    }
}
