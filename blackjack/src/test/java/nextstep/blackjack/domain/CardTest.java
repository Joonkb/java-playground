package nextstep.blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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