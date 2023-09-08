package baseball;

import baseball.ball.BallStatus;
import lombok.Getter;

@Getter
public class GameResult {
    private int ball;
    private int strike;

    public GameResult() {
        this.ball = 0;
        this.strike = 0;
    }

    // TODO: 더 간단하게 할 수 있는 코드가 있을 것 같음.
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
        if(this.getStrike() == 3 ) {
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

