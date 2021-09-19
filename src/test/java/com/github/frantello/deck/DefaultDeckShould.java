package com.github.frantello.deck;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class DefaultDeckShould {

    private Deck deck;

    @BeforeEach
    void setUp() {
        this.deck = new DefaultDeck(new FakeGenerator(), new SattoloShuffler());
    }

    @Test
    void deal_one_card() {
        Optional<Card> card = deck.dealOneCard();

        assertTrue(card.isPresent());
    }

    @Test
    void deal_all_cards() {
        IntStream.range(0, deck.count())
                .forEach(unused -> deck.dealOneCard());

        Optional<Card> card = deck.dealOneCard();

        assertFalse(card.isPresent());
    }

    @Test
    void shuffle_cards() {
        long count = deck.count();
        deck.shuffle();

        assertEquals(count, deck.count());
    }

    @Test
    void re_shuffle_cards() {
        long count = deck.count();
        deck.shuffle();
        deck.shuffle();

        assertEquals(count, deck.count());
    }

    @Test
    void throw_required_shuffler() {
        assertThrows(Error.class, () -> new DefaultDeck(new FakeGenerator(), null),
                "Required shuffler");
    }

    @Test
    void throw_required_generator() {
        assertThrows(Error.class, () -> new DefaultDeck(null, new SattoloShuffler()),
                "Required generator");
    }

    @Test
    void be_equals_by_identity() {
        Deck snapshot = deck;
        deck.dealOneCard();

        assertEquals(snapshot.getId(), deck.getId());
        assertEquals(snapshot, deck);
        assertNotEquals(new DefaultDeck(new FakeGenerator(), new SattoloShuffler()), deck);
        assertNotEquals(deck, null);
        assertNotEquals(deck, new Object());
    }

    @Test
    void hash() {
        Deck snapshot = deck;
        deck.dealOneCard();

        assertEquals(deck.hashCode(), deck.hashCode());
        assertEquals(snapshot.hashCode(), deck.hashCode());
    }

}