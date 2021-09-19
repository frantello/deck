package com.github.frantello.deck.pocker;

import com.github.frantello.deck.Card;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PokerGeneratorShould {

    @Test
    void generate_poker_cards() {
        List<Card> cards = new PokerGenerator().generate();

        assertNotNull(cards);
    }

}