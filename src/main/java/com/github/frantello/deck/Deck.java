package com.github.frantello.deck;

import java.util.Optional;
import java.util.UUID;

/**
 * The interface Deck.
 */
public interface Deck {

    /**
     * Gets id.
     *
     * @return the id
     */
    UUID getId();

    /**
     * Shuffle.
     */
    void shuffle();

    /**
     * Deal one card optional.
     *
     * @return the optional
     */
    Optional<Card> dealOneCard();

    /**
     * Count int.
     *
     * @return the long
     */
    int count();

}
