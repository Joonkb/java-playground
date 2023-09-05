package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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
    @DisplayName("")
    void GamePlayTest_2ball_1strike() {
        GameResult result = computerBalls.play(userBalls);
        assertThat(result.getBall(), 2);
        assertThat(result.getStrike(), 1);
    }
}
