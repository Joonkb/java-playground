package nextstep.blackjack.domain.participant;

import nextstep.blackjack.domain.card.Card;

import java.util.List;

public class Player extends Participant {

    private String name;
    private int bettingAmount;

    public Player(String name) {
        this.name = name;
    }

    public Player(List<Card> cards, String name) {
        super(cards);
        this.name = name;
    }

}