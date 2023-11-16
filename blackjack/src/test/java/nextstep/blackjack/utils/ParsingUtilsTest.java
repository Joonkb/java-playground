package nextstep.blackjack.utils;

import nextstep.blackjack.domain.Player;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ParsingUtilsTest {
    @Test
    @DisplayName("문자열 파싱 테스트")
    void 문자열파싱_테스트() {
        List<Player> players = ParsingUtils.parse("KBJ,SSH,BSY,LKY");
        Assertions.assertThat(players.get(0).getName()).isEqualTo("KBJ");
        Assertions.assertThat(players.get(1).getName()).isEqualTo("SSH");
        Assertions.assertThat(players.get(2).getName()).isEqualTo("BSY");
        Assertions.assertThat(players.get(3).getName()).isEqualTo("LKY");
    }
}
