package baseball;

import lombok.Getter;

@Getter
public class GameResult {
    private int ball;
    private int strike;

    // TODO 더 간단하게 할 수 있는 코드가 있음.
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

    public boolean isGameStop() {
        if( getBall() == 0 && getStrike() == 0 ) return true;
        return false;
    }

    @Override
    public String toString() {
        return "GameResult{" +
                "ball=" + ball +
                ", strike=" + strike +
                '}';
    }
}

