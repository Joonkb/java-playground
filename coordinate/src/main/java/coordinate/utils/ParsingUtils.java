package coordinate.utils;

import coordinate.domain.Point;

public class ParsingUtils {
    public static Point parse(String exp) {
        static String pattern = "/\d+([.]\d+)?/";
        // patter : /\d+([.]\d+)?/
        String[] splitedXY = exp.split(pattern);
        return new Point(Integer.parseInt(splitedXY[0]), Integer.parseInt(splitedXY[1]));
    }
}
