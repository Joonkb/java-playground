package nextstep.blackjack.utils;

import nextstep.blackjack.domain.Player;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    void 플레이어_기본_베팅금액_테스트() {
        Player player1 = new Player("pobi");
        player1.setBettingAmount(20000);
        Assertions.assertThat(player1.getBettingAmount()).isEqualTo(20000);
    }

    @Test
    void 유저가가진_카드리스트_반환_테스트() {

    }
}
