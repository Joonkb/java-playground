package nextstep.blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardEnumTest {

    @Test
    @DisplayName("카드 종류에 따른 점수반환 테스트 [Ace의 경우 가장작은 점수반환]")
    void 카드_종류에따른_점수반환_테스트() {
        CardEnum card = CardEnum.CLUB_2;
        int point = card.getCardPoint();
        Assertions.assertThat(point).isEqualTo(2);
    }

    @Test
    @DisplayName("카드 종류 Enum에 따른 한글이름 반환 테스트")
    void 카드_종류에따른_한글이름_테스트() {
        CardEnum card = CardEnum.CLUB_2;
        Assertions.assertThat(card.getCardInfoWithHangul()).isEqualTo("2클로버");
    }
}