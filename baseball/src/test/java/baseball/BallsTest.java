package baseball;

import baseball.ball.Ball;
import baseball.ball.BallStatus;
import baseball.ball.Balls;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    Balls computerBalls;

    @BeforeEach
    void before() {
        computerBalls = new Balls();
        computerBalls.addBall(new Ball(1, 1));
        computerBalls.addBall(new Ball(4, 2));
        computerBalls.addBall(new Ball(5, 3));
    }

    @Test
    @DisplayName("컴퓨터의 숫자'들'과 사용자의 볼 하나를 비교한다 -> 결과 : STRIKE")
    void ballsTest_STRIKE() {
        assertThat(computerBalls.play(new Ball(1, 1)).equals(BallStatus.STRIKE)).isTrue();
    }

    @Test
    @DisplayName("컴퓨터의 숫자'들'과 사용자의 볼 하나를 비교한다. -> 결과 : BALL")
    void ballsTest_BALL() {
        assertThat(computerBalls.play(new Ball(4, 1)).equals(BallStatus.BALL)).isTrue();
    }

    @Test
    @DisplayName("컴퓨터의 숫자'들'과 사용자의 볼 하나를 비교한다. -> 결과: NOTHING")
    void ballsTest_NOTHING() {
        assertThat(computerBalls.play(new Ball(9, 3)).equals(BallStatus.NOTHING)).isTrue();
    }
}
