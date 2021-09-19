package com.github.frantello.deck.pocker;

import com.github.frantello.deck.Card;
import com.github.frantello.deck.Error;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.frantello.deck.pocker.PokerCardMother.*;
import static com.github.frantello.deck.pocker.PokerFace.ACE;
import static com.github.frantello.deck.pocker.PokerSuit.CLUBS;
import static org.junit.jupiter.api.Assertions.*;

class PokerCardShould {

    private Card card;

    @BeforeEach
    void setUp() {
        card = aceOfClubs();
    }

    @Test
    void return_card() {
        assertNotNull(card);
        assertEquals(CLUBS, card.getSuit());
        assertEquals(ACE, card.getFace());
    }

    @Test
    void throw_required_face() {
        assertThrows(Error.class, () -> new PokerCard(null, CLUBS), "Required face");
    }

    @Test
    void throw_required_suit() {
        assertThrows(Error.class, () -> new PokerCard(ACE, null), "Required suit");
    }

    @Test
    void be_equals_by_state() {
        assertEquals(card, card);
        assertEquals(aceOfClubs(), card);
        assertNotEquals(card, null);
        assertNotEquals(card, new Object());
        assertNotEquals(queenOfClubs(), kingOfClubs());
    }

    @Test
    void hash() {
        assertEquals(card.hashCode(), card.hashCode());
        assertEquals(aceOfClubs().hashCode(), card.hashCode());
    }

}