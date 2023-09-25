package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String exp) {

        if (checkBlankOrNull(exp)) return 0;

        String[] numbers;

        // 커스텀 구분자를 지정할 수 있다.
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(exp);
        if (m.find()) {
            String customDelimiter = m.group(1);
            numbers = m.group(2).split(customDelimiter);
            checkNegNumberIsIn(numbers);
            return calc(numbers);
        }

        // 숫자가 한개인 경우에는 그대로 숫자를 출력한다.
        numbers = exp.split(",|:");
        if(numbers.length  == 1) return Integer.parseInt(numbers[0]);

        // 음수가 존재하는지 검증하기
        checkNegNumberIsIn(numbers);

        // 구분자로 분리해서 계산된 합을 반환한다.
        return calc(numbers);
    }

    private static boolean checkBlankOrNull(String exp) {
        if ("".equals(exp) || exp == null) {
            return true;
        }
        return false;
    }

    private static int calc(String[] numbers) {
        int res = 0;
        for (String num : numbers) {
            res += Integer.parseInt(num);
        }
        return res;
    }

    private static void checkNegNumberIsIn(String[] numbers) {
        for (String num : numbers) {
            if(Integer.parseInt(num) < 0)
                throw new RuntimeException();
        }
    }
}
