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
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(1, 1));
        balls.add(new Ball(4, 2));
        balls.add(new Ball(5, 3));

        balls = new ArrayList<>();
        balls.add(new Ball(5, 1));
        balls.add(new Ball(4, 2));
        balls.add(new Ball(1, 3));

        computerBalls = new Balls(balls);
        userBalls = new Balls(balls);
    }

    @Test
    @DisplayName("2볼 1스트라이크 테스트")
    void GamePlayTest_2ball_1strike() {
        GameResult result = computerBalls.play(userBalls);
        Assertions.assertThat(result.getStrike()).isEqualTo(1);
        Assertions.assertThat(result.getBall()).isEqualTo(2);
    }

    @Test
    @DisplayName("3볼 테스트")
    void GamePlayTest_3ball() {
        GameResult result = computerBalls.play(userBalls);
        Assertions.assertThat(result.getStrike()).isEqualTo(0);
        Assertions.assertThat(result.getBall()).isEqualTo(3);
    }

    @Test
    @DisplayName("낫싱 테스트")
    void GamePlayTest_() {
        GameResult result = computerBalls.play(userBalls);
        Assertions.assertThat(result.getStrike()).isEqualTo(0);
        Assertions.assertThat(result.getBall()).isEqualTo(0);
    }
}
