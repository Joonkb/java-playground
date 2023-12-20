package nextstep.blackjack.state;

import nextstep.blackjack.domain.card.Cards;

public abstract class Running extends Started {

    public Running(final Cards cards) {
        super(cards);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    public double profit(double profit) {
        return 0.0;
    }
}