package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    Balls computerBalls;

    @BeforeEach
    void before() {
//        List<Ball> balls = new ArrayList<>();
//        balls.add(new Ball(1, 1));
//        balls.add(new Ball(4, 2));
//        balls.add(new Ball(5, 3));
//        computerBalls = new Balls(balls);
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
