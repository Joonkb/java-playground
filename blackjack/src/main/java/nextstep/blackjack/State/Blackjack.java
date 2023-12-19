package nextstep.blackjack.State;

import nextstep.blackjack.domain.Cards;

    public class Blackjack extends Finished {

        public Blackjack(final Cards cards) {
            super(cards);
        }

        @Override
        public double earningRate() {
            return 1.5;
        }

}