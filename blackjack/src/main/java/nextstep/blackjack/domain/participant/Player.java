package nextstep.blackjack.domain.participant;

import lombok.Getter;
import lombok.Setter;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.card.PlayingCard;

@Setter
@Getter
public class Player extends Participant {

    private int bettingAmount;

    public Player(String name) {
        super(name);
    }

    public void addCard(PlayingCard deck) {
    }
}