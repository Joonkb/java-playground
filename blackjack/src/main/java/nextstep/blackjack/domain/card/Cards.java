package nextstep.blackjack.domain.card;

import nextstep.blackjack.utils.CCM;

import java.util.List;
import java.util.stream.Collectors;

import static nextstep.blackjack.utils.CCM.BUST_MIN_SCORE;

public class Cards {
    
    private List<Card> cards;

    public Cards(List<Card> cards) {
        this.cards = cards;
    }

    public boolean isBust() {
        if(calculateScore() > BUST_MIN_SCORE) return true;
        return false;
    }

    public void add(final PlayingCard card) {
        cards.add(card.getRandomCard());
    }

    /**
     * Ace 카드는 11점으로 처리하고 Bust점수인 경우 1점으로 처리한다.
     */
    public int calculateScore() {
        int AceCardCnt  = howManyAceInCards();
        int simpleScore = calculateSimpleScore();

        if (AceCardCnt == 0) {
            return simpleScore;
        }
        while (AceCardCnt > 0 && simpleScore > BUST_MIN_SCORE ) {
            simpleScore -= 10;
            AceCardCnt  -= 1;
        }
        return simpleScore;
    }

    private int calculateSimpleScore() {
        return cards.stream()
                .mapToInt(card -> card.getScore())
                .sum();
    }

    private int howManyAceInCards() {
        return (int) cards.stream()
                          .filter(card -> card.isAceCard())
                          .count();
    }

    public String getCardListWithString(int limit) {
        return cards.stream()
                .map(card -> card.toString())
                .limit(limit)
                .collect(Collectors.joining(","));
    }

    public int getCardListSize() {
        return cards.size();
    }
}
