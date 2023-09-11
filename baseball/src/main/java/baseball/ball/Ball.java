package baseball.ball;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ball {
    private int number;
    private int position;

    public Ball(int number, int position) {
        this.number = number;
        this.position = position;
    }

    public BallStatus play(Ball userBall) {
        if(this.equals(userBall)) {
            return BallStatus.STRIKE;
        }

        if (this.getNumber() == userBall.getNumber() &&
            this.getPosition() != userBall.getPosition() ) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Ball) {
            Ball other = (Ball) obj;
            return (number == other.number) &&
                    (position == other.position);
        }
        return false;
    }
}
