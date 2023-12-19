package nextstep.blackjack.State;

import nextstep.blackjack.domain.Cards;
import nextstep.blackjack.domain.PlayingCard;

public abstract class Started implements State {

    private final Cards cards;

    public Started(Cards cards) {
        this.cards = cards;
    }
    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public Cards cards() {
        return null;
    }

}

