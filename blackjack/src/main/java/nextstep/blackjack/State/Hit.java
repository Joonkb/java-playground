package nextstep.blackjack.State;

import nextstep.blackjack.domain.Cards;
import nextstep.blackjack.domain.PlayingCard;

public class Hit extends Running {
    public Hit(final Cards cards) {
        super(cards);
    }

    @Override
    public State draw(final PlayingCard card) {
        cards.add(card);
        if (cards.isBust()) {
            return new Bust(cards);
        }
        return new Hit(cards);
    }

    @Override
    public State stay() {
        return new Stay(cards);
    }
}

