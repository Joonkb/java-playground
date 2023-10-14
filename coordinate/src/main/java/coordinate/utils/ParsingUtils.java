package coordinate.utils;

import coordinate.domain.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingUtils {

    private static final Pattern pattern = Pattern.compile("\\((\\d+),(\\d+)\\)");

    // List<Point>를 반환한다.
    public static List<Point> parse(String input) {
        List<Point> points = new ArrayList<>();
        for (String xy : input.split("-")) {
            Matcher matcher = pattern.matcher(xy);
            if (matcher.matches()) {
                points.add(createPoint(matcher));
            }
        }
        return points;
    }

    private static Point createPoint(Matcher matcher) {
        return new Point(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
    }
}