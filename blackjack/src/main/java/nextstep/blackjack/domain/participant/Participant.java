package nextstep.blackjack.domain.participant;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.state.State;

import java.util.ArrayList;
import java.util.List;

public abstract class Participant {

    private List<Card> cards;
    private State state;

    Participant() {
        cards = new ArrayList<>();
    }

    public Participant(List<Card> cards) {
        this.cards = cards;
    }

}
