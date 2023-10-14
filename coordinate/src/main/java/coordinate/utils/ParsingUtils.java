package coordinate.utils;

import coordinate.domain.Point;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingUtils {

    private static final Pattern pattern = Pattern.compile("\\((\\d+),(\\d+)\\)");

    // Point 1개를 파싱한다.
    public static Point parse(String input) {

        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return new Point(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        }
        System.out.println(" abc = ");
        return new Point(0, 0);
    }
}