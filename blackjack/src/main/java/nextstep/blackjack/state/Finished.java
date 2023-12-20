package nextstep.blackjack.state;

import nextstep.blackjack.domain.card.Cards;

public abstract class Finished extends Started {

    public Finished(final Cards cards) {
        super(cards);
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