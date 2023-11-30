package nextstep.blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static nextstep.blackjack.domain.Deck.getDeckSize;
import static nextstep.blackjack.domain.Deck.getRandomCard;
import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    @DisplayName("덱에서 지정한 수만큼 카드를 반환")
    void 덱에서_카드_여러장_반환() {
        Deck deck = new Deck();

        int size = 5;
        List<CardEnum> cards = deck.getRandomCardsWithSize(size);
        Assertions.assertThat(cards.size()).isEqualTo(size);

        cards.stream().forEach(cardEnum -> System.out.println("cardEnum = " + cardEnum));
    }
}