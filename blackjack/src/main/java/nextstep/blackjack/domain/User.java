package nextstep.blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private static List<CardEnum> cardList;

    public User() {
        cardList = new ArrayList<>();
    }

    public void addCard(CardEnum card) {
        cardList.add(card);
    }
}
