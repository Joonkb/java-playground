package nextstep.blackjack.state;

import nextstep.blackjack.domain.card.Cards;

public abstract class Started implements State {

    protected final Cards cards;

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

