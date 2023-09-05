package baseball;

import lombok.Getter;

@Getter
public class GameResult {
    private int ball;
    private int strike;

    public void make(BallStatus status) {
        if (BallStatus.STRIKE.equals(status)) {
            strike += 1;
        }
        if (BallStatus.BALL.equals(status)) {
            ball += 1;
        }
    }
}

