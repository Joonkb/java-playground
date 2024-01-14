package nextstep.blackjack.state;

import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.card.PlayingCard;

public abstract class Finished extends Started {

    public Finished(final Cards cards) {
        super(cards);
    }

    @Override
    public State stay() {
        return null;
    }

    @Override
    public State draw(PlayingCard card) {
        return null;
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public double profit(double x) {
        return 0;
    }

    abstract double earningRate();
}