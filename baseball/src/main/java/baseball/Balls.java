package baseball;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Balls {
    private List<Ball> balls;

    public Balls() {
        balls = new ArrayList<>();
    }

    public Balls(List<Integer> randomNumber) {
        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(randomNumber.get(i), i + 1));
        }
    }

    public BallStatus play(Ball userBall) {
        // TODO: 리팩토링
        BallStatus status = BallStatus.NOTHING;
        for (Ball computerBall : balls) {
            if (computerBall.equals(userBall)) {
                return BallStatus.STRIKE;
            }
            if(computerBall.play(userBall) == BallStatus.BALL){
                status = BallStatus.BALL;
            }
        }
        return status;

        // TODO: stream() 사용하여 풀어볼 것!
//        return balls.stream()
//                .map(ball -> ball.play(userBall))
//                .filter(status -> status == BallStatus.STRIKE)
//                .findFirst()
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public GameResult play(Balls userBalls) {
        GameResult result = new GameResult();
        for (Ball ball : userBalls.getBalls()) {
            result.make(this.play(ball));
        }
        return result;
    }
}
