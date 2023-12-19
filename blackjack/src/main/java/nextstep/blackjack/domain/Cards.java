package nextstep.blackjack.domain;

import java.util.List;

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
}
