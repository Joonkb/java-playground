package nextstep.blackjack.State;

import nextstep.blackjack.domain.Cards;
import nextstep.blackjack.domain.PlayingCard;

public class Bust extends Finished {

    public Bust(final Cards cards) {
        super(cards);
    }

    @Override
    double earningRate() {
        return 0;
    }
}