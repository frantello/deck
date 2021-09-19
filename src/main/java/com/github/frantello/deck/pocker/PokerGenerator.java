package com.github.frantello.deck.pocker;

import com.github.frantello.deck.Card;
import com.github.frantello.deck.Generator;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.github.frantello.deck.Error.requireNonNull;

/**
 * The type Poker generator.
 */
public class PokerGenerator implements Generator {

    /**
     * Generate list.
     *
     * @return the list
     */
    @Override
    public List<Card> generate() {
        return Stream.of(PokerSuit.values())
                .map(this::generateSuite)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    /**
     * Generate suite list.
     *
     * @param suit the suit
     * @return the list
     */
    private List<Card> generateSuite(PokerSuit suit) {
        requireNonNull(suit, "Required suit");

        return Stream.of(PokerFace.values())
                .map(face -> new PokerCard(face, suit))
                .collect(Collectors.toList());
    }

}
