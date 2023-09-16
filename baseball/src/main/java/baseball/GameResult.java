package baseball;

import baseball.ball.BallStatus;
import lombok.Getter;

@Getter
public class GameResult {
    private int ball;
    private int strike;

    private static final int STRIKE_OUT_VALUE = 3;

    public GameResult() {
        this.ball = 0;
        this.strike = 0;
    }

    public void make(BallStatus status) {
        if (BallStatus.STRIKE.equals(status)) {
            incrementStrikeCount();
        }
        if (BallStatus.BALL.equals(status)) {
            incrementBallCount();
        }
    }

    private void incrementBallCount() {
        ball += 1;
    }

    private void incrementStrikeCount() {
        strike += 1;
    }

    public boolean isNothing() {
        return getBall() == 0 && getStrike() == 0;
    }

    public boolean isGameStop() {
        if(this.getStrike() == STRIKE_OUT_VALUE ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GameResult{" +
                "ball=" + ball +
                ", strike=" + strike +
                '}';
    }
}

