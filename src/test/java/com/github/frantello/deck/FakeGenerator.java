package com.github.frantello.deck;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FakeGenerator implements Generator {

    private final int size;

    public FakeGenerator() {
        this(42);
    }

    public FakeGenerator(int size) {
        this.size = size;
    }

    @Override
    public List<Card> generate() {
        return IntStream.range(0, size)
                .mapToObj(unused -> new FakeCard())
                .collect(Collectors.toList());
    }

}
