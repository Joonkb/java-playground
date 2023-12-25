package nextstep.blackjack.domain.card;

import java.util.List;
import java.util.stream.Collectors;

public class Cards {
    
    private List<Card> cards;

    public Cards(List<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public boolean isBust() {
        return false;
    }

    public void add(PlayingCard card) {
        cards.add(card.getRandomCard());
    }

    private int calculateScore() {
        return cards.stream()
                .mapToInt(card -> card.getScore())
                .sum();
    }
}
