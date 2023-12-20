package nextstep.blackjack.domain.participant;

import nextstep.blackjack.domain.card.Card;

import java.util.List;

public class Dealer extends Participant {

    Dealer() {

    }

    public Dealer(List<Card> cards) {
        super(cards);
    }
}
