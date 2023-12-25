package nextstep.blackjack.domain.participant;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.state.State;
import nextstep.blackjack.state.Stay;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.List;

public abstract class Participant {

    private State state;
    private String name;

    Participant(String name) {
        this.name = name;
    }

    public Participant(List<Card> cards) {
        state = new Stay(new Cards(cards));
    }

    public String getName() {
        return name;
    }

}
