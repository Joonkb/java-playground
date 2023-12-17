package nextstep.blackjack.State;

import nextstep.blackjack.domain.Cards;
import nextstep.blackjack.domain.PlayingCard;

public abstract class Started implements State {

    private Cards cards;

    @Override
    public State draw(PlayingCard card) {

        return null;
    }

    @Override
    public State stay() {
        return null;
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public Cards cards() {
        return null;
    }

    @Override
    public double profit(double x) {
        return 0;
    }
}
