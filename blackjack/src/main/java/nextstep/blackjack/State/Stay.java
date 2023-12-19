package nextstep.blackjack.State;

import nextstep.blackjack.domain.Cards;
import nextstep.blackjack.domain.PlayingCard;

public class Stay extends Finished {

    public Stay(Cards cards) {
        super(cards);
    }

    @Override
    double earningRate() {
        return 0;
    }
}
