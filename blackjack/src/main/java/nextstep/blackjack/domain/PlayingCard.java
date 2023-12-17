package nextstep.blackjack.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayingCard {

    private List<Card> deck;

    public PlayingCard() {
        deck = new ArrayList<>();
        for (Suit type : Suit.values()) {
            for(Denomination value : Denomination.values()){
                deck.add(new Card(type, value));
            }
        }
    }

    public Card getRandomCard() {
        Random random = new Random();
        int randNum = random.nextInt(deck.size());
        return deck.remove(randNum);
    }
}