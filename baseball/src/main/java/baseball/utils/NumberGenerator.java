package baseball.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {

    public static List<Integer> createRandomNumber() {
        Random random = new Random();
        List<Integer> balls = new ArrayList<>();
        // TODO: BAll 한테 위임
        while (balls.size() < 3) {
            int num = random.nextInt(9) + 1;
            makeBalls(balls, num);
        }
        return balls;
    }

    private static void makeBalls(List<Integer> balls, int num) {
        if(!balls.contains(num) && ValidationUtils.isValidNumber(num)){
            balls.add(num);
        }
    }
}
