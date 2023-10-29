package coordinate.utils;

import coordinate.domain.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingUtils {

    private static final Pattern pattern = Pattern.compile("\\((\\d+),(\\d+)\\)"); // 좌표를 추출하기 위한 정규표현식.
    private static final String DELIMITER = "-";

    public static List<Point> parse(String s) {
        List<Point> pointList = new ArrayList<>();
        for (String xy : s.split(DELIMITER)) {
            pointList.add(createPoint(xy));
        }
        return pointList;
    }

    private static Point createPoint(String xy) {
        Matcher matcher = pattern.matcher(xy);
        if (matcher.matches()) {
            return new Point(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        }
        throw new IllegalArgumentException("올바른 좌표 형식이 아닙니다.");
    }
}
