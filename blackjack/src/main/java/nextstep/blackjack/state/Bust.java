package nextstep.blackjack.state;

import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.card.PlayingCard;

public class Bust extends Finished {

    public Bust(final Cards cards) {
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