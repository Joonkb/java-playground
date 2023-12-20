package nextstep.blackjack.state;

import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.card.PlayingCard;

public class Stay extends Finished {

    public Stay(Cards cards) {
        super(cards);
    }

    @Override
    double earningRate() {
        return 0;
    }

    @Override
    public State draw(PlayingCard card) {
        return null;
    }
}
