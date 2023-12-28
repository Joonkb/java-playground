package nextstep.blackjack.domain.participant;

import lombok.Getter;
import lombok.Setter;
import nextstep.blackjack.domain.card.Cards;

@Setter
@Getter
public class Player extends Participant {

    private int bettingAmount;

    public Player(String name) {
        super(name);
    }

    public Cards getCardsList() {
        return getState().cards();
    }
}