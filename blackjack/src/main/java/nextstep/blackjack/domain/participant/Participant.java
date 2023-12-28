package nextstep.blackjack.domain.participant;

import lombok.Getter;
import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.card.PlayingCard;
import nextstep.blackjack.state.Hit;
import nextstep.blackjack.state.State;
import nextstep.blackjack.state.Stay;

import java.util.List;

@Getter
public abstract class Participant {

    private static final int FIRST_TWO_CARD = 2;

    private State state;
    private String name;

    Participant(String name) {
        this.name = name;
    }

    public Participant(List<Card> cards) {
        state = new Stay(new Cards(cards));
    }

    public void receiveTwoCards(PlayingCard deck) {
        state = new Hit(new Cards(deck.getRandomCardsWithSize(FIRST_TWO_CARD)));
    }

    public Cards getCards() {
        return state.cards();
    }

    public String getCardListWithString(int size) {
        if (size == -1 ) {
            this.getCards().getCardListWithString(getCards().getCardListSize());
        }
        return this.getCards().getCardListWithString(size);
    }
}
