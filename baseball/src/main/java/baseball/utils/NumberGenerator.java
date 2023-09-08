package baseball.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {

    public static List<Integer> createRandomNumber() {
        Random random = new Random();
        List<Integer> balls = new ArrayList<>();
        while (balls.size() < 3) {
            // 좋은 방식은 아닌듯 -> depth 1을 맞추기 위한 억지스러운 방식.
            int num = random.nextInt(9) + 1;
            makeBalls(balls, num);
        }
        return balls;
    }

    private static void makeBalls(List<Integer> balls, int num) {
        if(!balls.contains(num)){
            balls.add(num);
        }
    }
}
