package nextstep.blackjack.domain;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.PlayingCard;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayingCardTest {

    @Test
    @DisplayName("랜덤카드 한 장 반환 테스트")
    void getRandomCardTest() {
        PlayingCard deck = new PlayingCard();
        Card card = deck.getRandomCard();
        System.out.println("card = " + card);
        Assertions.assertThat(card).isInstanceOf(Card.class);
    }
}