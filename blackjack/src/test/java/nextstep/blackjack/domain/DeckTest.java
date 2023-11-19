package nextstep.blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static nextstep.blackjack.domain.Deck.getDeckSize;
import static nextstep.blackjack.domain.Deck.getRandomCard;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    @DisplayName("52장의 카드중 한장을 반환한다.")
    void 덱_한장_반환() {
        Deck deck = new Deck();
        int currentDeckSize = getDeckSize();
        CardEnum randomCard = getRandomCard();
        System.out.println("randomCard = " + randomCard);

        assertThat(randomCard).isInstanceOf(CardEnum.class);
        assertThat(currentDeckSize - 1).isEqualTo(getDeckSize());   // 반환 후 Deck 사이즈 검증 
    }
}