package nextstep.blackjack.domain.participant;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.state.State;
import nextstep.blackjack.state.Stay;

import java.util.List;

public abstract class Participant {

    // State 안에 Cards가 있음.
    private State state;

    Participant() {
        // 참가자는
    }

    public Participant(List<Card> cards) {
        state = new Stay(new Cards(cards));
    }

}
