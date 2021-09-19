package com.github.frantello.deck;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SattoloShufflerShould {

    private Shuffler shuffler;

    @BeforeEach
    void setUp() {
        this.shuffler = new SattoloShuffler();
    }

    @Test
    void shuffle_empty_collection() {
        List<Card> cards = new FakeGenerator(0).generate();

        shuffler.shuffle(cards);

        assertTrue(cards.isEmpty());
    }

    @Test
    void shuffle_one_element_collection() {
        int size = 1;
        List<Card> cards = new FakeGenerator(size).generate();
        List<Card> snapshot = new ArrayList<>(cards);

        shuffler.shuffle(cards);

        assertEquals(size, cards.size());
        assertEquals(snapshot, cards);
    }

    @Test
    void shuffle_two_element_collection() {
        int size = 2;
        List<Card> cards = new FakeGenerator(size).generate();
        List<Card> snapshot = new ArrayList<>(cards);

        shuffler.shuffle(cards);

        assertEquals(size, cards.size());
        assertNotEquals(snapshot, cards);
    }

    @Test
    void shuffle_generated_collection() {
        List<Card> cards = new FakeGenerator().generate();
        List<Card> snapshot = new ArrayList<>(cards);

        shuffler.shuffle(cards);

        assertEquals(snapshot.size(), cards.size());
        assertNotEquals(snapshot, cards);
    }

}