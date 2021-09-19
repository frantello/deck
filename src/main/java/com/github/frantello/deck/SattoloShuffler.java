package com.github.frantello.deck;

import java.util.List;
import java.util.Random;

import static com.github.frantello.deck.Error.requireNonNull;

/**
 * The type Fisher yates shuffler.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher–Yates shuffle</a>
 * @see <a href="https://rosettacode.org/wiki/Sattolo_cycle">Sattolo shuffle</a>
 */
public class SattoloShuffler implements Shuffler {

    /**
     * The Random.
     */
    private final Random random;

    /**
     * Instantiates a new Fisher yates shuffler.
     */
    public SattoloShuffler() {
        this.random = new Random();
    }

    /**
     * Shuffle.
     *
     * @param cards the cards
     */
    @Override
    public void shuffle(List<Card> cards) {
        requireNonNull(cards, "Required cards");

        for (int i = cards.size() - 1; i > 0; i--) {
            int j = random.nextInt(i);
            cards.set(j, cards.set(i, cards.get(j)));
        }
    }

}
