package nextstep.blackjack.State;

import nextstep.blackjack.domain.Cards;
import nextstep.blackjack.domain.PlayingCard;

public abstract class Finished extends Started {

    public Finished(final Cards cards) {
        super(cards);
    }

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
        return super.isFinished();
    }

    @Override
    public double profit(double x) {
        return 0;
    }

    abstract double earningRate();
}