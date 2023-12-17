package nextstep.blackjack.State;

import nextstep.blackjack.domain.Card;
import nextstep.blackjack.domain.Cards;
import nextstep.blackjack.domain.PlayingCard;

public abstract class Running extends Started {

    protected Cards cards;

    public Running(Cards cards) {
        this.cards = cards;
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    public double profit(double profit) {
        return 0.0;
    }
}