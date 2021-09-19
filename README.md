# Deck

## About The Project

Deck is an extensible deck of cards with a totally free poker implementation.

Are you dreaming with spanish deck? Just do it, extend core classes and feel the power shuffling and dealing cards.

 ```java

    public class SpanishGenerator implements Generator {
    
        @Override
        public List<Card> generate() {
          // ...
        }
    
    }
    
    // ...
    
    Deck spanish = new DefaultDeck(new SpanishGenerator(), new SattoloShuffler());
    spanish.suffle();
    spanish.dealOneCard();

```

You don't like Sattolo's algorithm, do you really think you can do it better? Build your shuffler and plug in!


 ```java

    public class LivingLasVegasShuffler implements Shuffler {
    
        @Override
        public void shuffle(List<Card> cards) {
          // ...
        }
    
    }
    
    // ...
    
    Deck lasVegasPoker = new DefaultDeck(new PokerGenerator(), new LivingLasVegasShuffler());
    lasVegasPoker.suffle();
    lasVegasPoker.dealOneCard();

```

And don't forget that you can build your own cards, suits and faces too! ;-)

### Built With

* [Java](https://openjdk.java.net)
* [Junit5](https://junit.org/junit5)
* [Gradle](https://gradle.org)

This is it.

## Getting Started

Clone local copy of the repository and run simple step.

### Prerequisites

Java JDK 8+ is required.

* gradle
  ```sh
  ./gradlew build
  ```

## Roadmap

Only if you bring me a star.

## Contributing

You would really do that for me?

## License

Do whatever you want with it, peace and love.

## Acknowledgements

Family and friends, of course.
