package com.github.frantello.deck;

public class FakeCard implements Card {

    @Override
    public Face getFace() {
        return FakeFace.FAKE;
    }

    @Override
    public Suit getSuit() {
        return FakeSuit.FAKE;
    }

    public enum FakeFace implements Face {
        FAKE
    }

    public enum FakeSuit implements Suit {
        FAKE
    }

}
