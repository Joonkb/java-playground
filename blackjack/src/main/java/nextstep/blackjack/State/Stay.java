package nextstep.blackjack.State;

import nextstep.blackjack.domain.Cards;
import nextstep.blackjack.domain.PlayingCard;

public class Stay extends Finished {
    public Stay() {
    }

    public Stay(Cards cards) {
        super();
    }

    @Override
    public State draw(PlayingCard card) {
        return super.draw(card);
    }

    @Override
    public State stay() {
        return super.stay();
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }

    @Override
    public Cards cards() {
        return super.cards();
    }

    @Override
    public double profit(double x) {
        return super.profit(x);
    }
}
