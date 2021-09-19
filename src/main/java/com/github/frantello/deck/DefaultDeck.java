package com.github.frantello.deck;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import static com.github.frantello.deck.Error.requireNonNull;

/**
 * The type Default deck.
 */
public class DefaultDeck implements Deck {

    /**
     * The ID.
     */
    private final UUID id;

    /**
     * The Shuffler.
     */
    private final Shuffler shuffler;

    /**
     * The Cards.
     */
    private final List<Card> cards;

    /**
     * Instantiates a new Default deck.
     *
     * @param generator the generator
     * @param shuffler  the shuffler
     */
    public DefaultDeck(Generator generator, Shuffler shuffler) {
        requireNonNull(generator, "Required generator");
        requireNonNull(shuffler, "Required shuffler");

        this.id = UUID.randomUUID();
        this.shuffler = shuffler;
        this.cards = generator.generate();
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    @Override
    public UUID getId() {
        return id;
    }

    /**
     * Shuffle.
     */
    @Override
    public void shuffle() {
        shuffler.shuffle(cards);
    }

    /**
     * Deal one card optional.
     *
     * @return the optional
     */
    public Optional<Card> dealOneCard() {
        if (cards.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(cards.remove(0));
    }

    /**
     * Count long.
     *
     * @return the int
     */
    @Override
    public int count() {
        return cards.size();
    }

    /**
     * Equals boolean.
     *
     * @param object the object
     * @return the boolean
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        DefaultDeck deck = (DefaultDeck) object;

        return Objects.equals(id, deck.id);
    }

    /**
     * Hash code int.
     *
     * @return the int
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
