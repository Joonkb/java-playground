package nextstep.blackjack.domain;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Denomination;
import nextstep.blackjack.domain.card.Suit;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CardTest {

    @Test
    @DisplayName("카드 문자열 반환 테스트_1")
    void 카드_문자열반환_테스트_1() {
        Card card1 = new Card(Suit.CLUBS, Denomination.ACE);
        Assertions.assertThat(card1.toString()).isEqualTo("A클로버");
    }

    @Test
    @DisplayName("카드 문자열 반환 테스트_2")
    void 카드_문자열반환_테스트_2() {
        Card card1 = new Card(Suit.DIAMONDS, Denomination.JACK);
        Assertions.assertThat(card1.toString()).isEqualTo("J다이아몬드");
    }
}