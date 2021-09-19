package com.github.frantello.deck.pocker;

import com.github.frantello.deck.Card;

import java.util.Objects;

import static com.github.frantello.deck.Error.requireNonNull;

/**
 * The type Poker card.
 */
public class PokerCard implements Card {

    /**
     * The Face.
     */
    private final PokerFace face;

    /**
     * The Suit.
     */
    private final PokerSuit suit;

    /**
     * Instantiates a new Poker card.
     *
     * @param face the face
     * @param suit the suit
     */
    PokerCard(PokerFace face, PokerSuit suit) {
        requireNonNull(face, "Required face");
        requireNonNull(suit, "Required suit");

        this.face = face;
        this.suit = suit;
    }

    /**
     * Gets suit.
     *
     * @return the suit
     */
    @Override
    public PokerSuit getSuit() {
        return suit;
    }

    /**
     * Gets face.
     *
     * @return the face
     */
    @Override
    public PokerFace getFace() {
        return face;
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

        PokerCard card = (PokerCard) object;

        return Objects.equals(suit, card.suit) &&
                Objects.equals(face, card.face);
    }

    /**
     * Hash code int.
     *
     * @return the int
     */
    @Override
    public int hashCode() {
        return Objects.hash(suit, face);
    }

}
