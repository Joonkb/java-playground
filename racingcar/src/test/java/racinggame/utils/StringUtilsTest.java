package racinggame.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringUtilsTest {

    @ParameterizedTest
    @DisplayName("구분자로 문자열이 나뉘어지는지 테스트한다.")
    @CsvSource(value = {"bsy,ssh,lky:bsy:ssh:lky"}, delimiter = ':')
    void split_by_구분자(String input, String name1, String name2, String name3) {
        String[] names = StringUtils.splitByComma(input);
        Assertions.assertThat(names[0]).isEqualTo(name1);
        Assertions.assertThat(names[1]).isEqualTo(name2);
        Assertions.assertThat(names[2]).isEqualTo(name3);
    }
}
