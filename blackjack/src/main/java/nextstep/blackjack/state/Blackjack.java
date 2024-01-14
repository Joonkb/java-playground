package nextstep.blackjack.state;

import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.card.PlayingCard;

public class Blackjack extends Finished {

    public Blackjack(final Cards cards) {
            super(cards);
        }

    @Override
    public double earningRate() {
            return 1.5;
        }

    @Override
    public State draw(PlayingCard card) {
        return new Stay(cards);
    }
}