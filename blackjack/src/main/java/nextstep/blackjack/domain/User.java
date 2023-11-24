package nextstep.blackjack.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public abstract class User {

    private List<CardEnum> cardList;
    private final static Integer BLACKJACK_SCORE = 21;

    public User() {
        cardList = new ArrayList<>();
    }

    public void addCard(CardEnum card) {
        cardList.add(card);
    }

    public String showUserCards(int limit) {
        return cardList.stream()
                .map(e -> e.getCardInfoWithHangul())
                .limit(limit)
                .collect(Collectors.joining(", "));
    }

    public Integer calculateCardScore() {
        return cardList.stream()
                .map(card -> card.getCardPoint())
                .reduce(Integer::sum).get();
    }

    public boolean isBlackJackScore() {
        return this.calculateCardScore() == BLACKJACK_SCORE;
    }

    public boolean exceedBlackJackScoreYn() {
        return this.calculateCardScore() > BLACKJACK_SCORE;
    }
}