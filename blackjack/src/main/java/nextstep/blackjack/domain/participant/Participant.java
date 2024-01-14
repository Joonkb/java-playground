package nextstep.blackjack.domain.participant;

import lombok.Getter;
import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.card.PlayingCard;
import nextstep.blackjack.state.Blackjack;
import nextstep.blackjack.state.Hit;
import nextstep.blackjack.state.State;
import nextstep.blackjack.state.Stay;

import java.util.ArrayList;
import java.util.List;

import static nextstep.blackjack.utils.CCM.BUST_MIN_SCORE;

@Getter
public abstract class Participant {

    private static final int FIRST_TWO_CARD = 2;

    private String name;
    protected State state;

    Participant(String name) {
        this.name = name;
    }

    public void receiveTwoCards(PlayingCard deck) {
        final Cards twoCards = new Cards(deck.getRandomCardsWithSize(FIRST_TWO_CARD));
        state = new Hit(twoCards);
        if(calculateCardScore() == BUST_MIN_SCORE){
            state = new Blackjack(twoCards);
        }
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

    public int calculateCardScore() {
        return getCards().calculateScore();
    }
}
