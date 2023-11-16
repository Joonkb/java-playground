package nextstep.blackjack.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParsingUtilsTest {
    @Test
    @DisplayName("문자열 파싱 테스트")
    void 문자열파싱_테스트() {
        String[] parsed = ParsingUtils.parse("KBJ,SSH,BSY,LKY");
        Assertions.assertThat(parsed[0]).isEqualTo("KBJ");
        Assertions.assertThat(parsed[1]).isEqualTo("SSH");
        Assertions.assertThat(parsed[2]).isEqualTo("BSY");
        Assertions.assertThat(parsed[3]).isEqualTo("LKY");
    }
}
