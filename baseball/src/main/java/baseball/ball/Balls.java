package baseball.ball;

import baseball.GameResult;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Balls {
    private List<Ball> balls;

    public Balls() {
        balls = new ArrayList<>();
    }

    public Balls(String userBalls) {
        this();
        for (int digit = 0; digit < 3; ++digit) {
            int number = userBalls.charAt(digit) - '0';
            balls.add(new Ball(number, digit + 1));
        }
    }

    public Balls(List<Integer> randomNumber) {
        this();
        for (int order = 0; order < 3; order++) {
            balls.add(new Ball(randomNumber.get(order), order + 1));
        }
    }

    public BallStatus play(Ball userBall) {
        // TODO: 리팩토링
//        BallStatus status = BallStatus.NOTHING;
//        for (Ball computerBall : balls) {
//            if (computerBall.equals(userBall)) {
//                return BallStatus.STRIKE;
//            }
//            if(computerBall.play(userBall) == BallStatus.BALL){
//                status = BallStatus.BALL;
//            }
//        }
//        return status;

        // TODO: stream() 사용하여 풀어볼 것!
        return balls.stream()
                .map(ball -> ball.play(userBall))
                .filter(status -> status != BallStatus.NOTHING)
                .findAny()
                .orElse(BallStatus.NOTHING);
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
