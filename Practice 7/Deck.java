package com.company;

public abstract class Deck {
    public abstract void addAll(int[] a);
    public abstract void addOnTop(int card);
    public abstract void addTwoOnBottom(int card1, int card2);
    public abstract int getFromTop();
    public abstract boolean isEmpty();
    public abstract void addOneOnBottom(int card);
}
