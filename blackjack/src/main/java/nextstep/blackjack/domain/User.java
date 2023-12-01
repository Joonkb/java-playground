package nextstep.blackjack.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public abstract class User {

    private List<CardEnum> cardList;

    private final static Integer BLACKJACK_SCORE = 21;
    private final static Integer FIRST_CARD_SIZE = 2;

    public User() {
        cardList = new ArrayList<>();
    }

    public void addCard(CardEnum card) {
        cardList.add(card);
    }

    public void addCards(List<CardEnum> cards) {
        cardList.addAll(cards);
    }

    public String showUserCards(int limit) {
        return cardList.stream()
                .map(e -> e.getCardInfoWithHangul())
                .limit(limit)
                .collect(Collectors.joining(", "));
    }

    /**
     *  if : ACE 카드가 포함된 경우 (11점으로 계산한다.)
     *    if 21점이 넘은 경우 ACE를 1점으로 계산
     *    else 합을 반환
     *
     *  else
     *       카드 점수의 합을 계산한다.
     */
    public Integer calculateCardScore() {
        Integer score =  cardList.stream()
                                .map(card -> card.getCardPoint())
                                .reduce(Integer::sum).get();

        if(score > BLACKJACK_SCORE && hasAceCard()) {
            return score - 10;
        }
        return score;
    }

    public boolean isBlackJackScore() {
        return this.calculateCardScore() == BLACKJACK_SCORE;
    }

    public boolean exceedBlackJackScoreYn() {
        return this.calculateCardScore() > BLACKJACK_SCORE;
    }

    public boolean hasTwoCardsYn() {
        return cardList.size() == FIRST_CARD_SIZE;
    }
    private boolean hasAceCard() {
        return cardList.stream()
                .anyMatch(cardEnum -> cardEnum.isAceCard());
    }
}