package coordinate.utils;

import coordinate.domain.Point;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingUtils {
    public static Point parse(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        int x = -1, y = -1;
        while (matcher.find()) {
            if (x == -1) {
                x = Integer.parseInt(matcher.group());
            } else{
                y = Integer.parseInt(matcher.group());
            }
        }
        System.out.println("X , y = " + x + " " + y);
        return new Point(x, y);
    }

}
