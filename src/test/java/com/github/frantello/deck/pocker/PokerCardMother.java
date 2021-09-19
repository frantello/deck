package com.github.frantello.deck.pocker;

public final class PokerCardMother {

    private PokerCardMother() {
        super();
    }

    public static PokerCard aceOfClubs() {
        return new PokerCard(PokerFace.ACE, PokerSuit.CLUBS);
    }

    public static PokerCard queenOfClubs() {
        return new PokerCard(PokerFace.QUEEN, PokerSuit.CLUBS);
    }

    public static PokerCard kingOfClubs() {
        return new PokerCard(PokerFace.KING, PokerSuit.CLUBS);
    }

}
