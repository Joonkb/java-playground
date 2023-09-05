package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class BallsPlayTest {

    Balls computerBalls;
    Balls userBalls;

    @BeforeEach
    void before() {
        computerBalls = new Balls();
        computerBalls.addBall(new Ball(1, 1));
        computerBalls.addBall(new Ball(4, 1));
        computerBalls.addBall(new Ball(5, 1));

        userBalls = new Balls();
        userBalls.addBall(new Ball(1, 1));
        userBalls.addBall(new Ball(4, 1));
        userBalls.addBall(new Ball(5, 1));
    }

    @Test
    @DisplayName("2볼 1스트라이크 테스트")
    void GamePlayTest_2ball_1strike() {
        GameResult result = computerBalls.play(userBalls);
        Assertions.assertThat(result.getStrike()).isEqualTo(1);
        Assertions.assertThat(result.getBall()).isEqualTo(2);
    }

    @Test
    @DisplayName("3스트라이크 테스트")
    void GamePlayTest_3Strike() {
        GameResult result = computerBalls.play(userBalls);
        Assertions.assertThat(result.getStrike()).isEqualTo(3);
        Assertions.assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    @DisplayName("3볼 테스트")
    void GamePlayTest_3ball() {
        GameResult result = computerBalls.play(userBalls);
        Assertions.assertThat(result.getStrike()).isEqualTo(0);
        Assertions.assertThat(result.getBall()).isEqualTo(3);
    }
}