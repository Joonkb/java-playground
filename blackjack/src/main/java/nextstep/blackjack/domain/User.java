package nextstep.blackjack.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public abstract class User {

    private List<CardEnum> cardList;

    public User() {
        cardList = new ArrayList<>();
    }

    public void addCard(CardEnum card) {
        cardList.add(card);
    }
    // TODO: 몇 장의 카드를 보여줄지 size 를 입력받도록.
    public String showUserCards() {
        return cardList.stream()
                .map(e -> e.getCardInfoWithHangul())
                .collect(Collectors.joining(", "));
    }

    public Integer calculateCardScore() {
        return cardList.stream()
                .map(card -> card.getCardPoint())
                .reduce(Integer::sum).get();
    }
}