package nextstep.blackjack.domain.participant;

import lombok.Getter;
import lombok.Setter;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.card.PlayingCard;
import nextstep.blackjack.state.Bust;

@Setter
@Getter
public class Player extends Participant {

    private int bettingAmount;

    public Player(String name) {
        super(name);
    }

    public void draw(PlayingCard deck) {
        state.draw(deck);
    }

    public boolean isBust() {
        if (state instanceof Bust) {
            return true;
        }
        return false;
    }
}