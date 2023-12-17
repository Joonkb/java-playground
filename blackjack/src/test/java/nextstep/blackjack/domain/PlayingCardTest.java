package nextstep.blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCardTest {

    @Test
    @DisplayName("랜덤카드 한 장 반환 테스트")
    void getRandomCardTest() {

        PlayingCard deck = new PlayingCard();
        Card card = deck.getRandomCard();

        Assertions.assertThat(card).isInstanceOf(Card.class);
    }

}