package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    @DisplayName("컴퓨터볼과 사용자볼이 STRIKE인지 여부 확인")
    void ballTest_STRIKE() {
        Ball computerBall = new Ball(2, 1);
        Ball userBall = new Ball(2, 1);
        assertThat(computerBall.play(userBall).equals(BallStatus.STRIKE)).isTrue();
    }

    @Test
    @DisplayName("컴퓨터볼과 사용자볼이 BALL인지 여부 확인")
    void ballTest_BALL() {
        Ball computerBall = new Ball(2, 1);
        Ball userBall = new Ball(2, 3);
        assertThat(computerBall.play(userBall).equals(BallStatus.BALL)).isTrue();
    }

    @Test
    @DisplayName("컴퓨터볼과 사용자볼이 NOTHING 인지 여부 확인")
    void ballTest_NOTHING() {
        Ball computerBall = new Ball(3, 1);
        Ball userBall = new Ball(4, 3);
        assertThat(computerBall.play(userBall).equals(BallStatus.NOTHING)).isTrue();
    }
}