package coordinate.view;

import coordinate.domain.Point;
import coordinate.domain.Points;
import coordinate.domain.Shape;

import java.util.Arrays;
import java.util.List;

public class DrawView {

    public static final int MAX_VALUE = 24;

    public static void drawCoordinate(Shape shape) {
        // 좌표를 배열의 인덱스로 변환한다.
        char[][] coordinate = convertToArrayIndex(shape);
        for (int i = MAX_VALUE; i > 0; i--) {
            drawYaxis(i);              // Y축과 눈금(숫자)을 표시한다.
            drawPoint(coordinate[i]);  // 좌표평면 위의 점을 표시한다.
        }
        // X축과 눈금을 표시한다.
        drawXaxis();
    }

    /**
     * Y축 및 눈금(숫자)을 그린다.
     */
    private static void drawYaxis(int i) {
        if (i % 2 == 0) System.out.printf("%2d", i);
        else System.out.printf("%2s", " ");
        System.out.printf("|");
    }

    /**
     * 좌표평면 위의 점을 그린다.
     */
    private static void drawPoint(char[] coordinate) {
        for (int j = 0; j <= MAX_VALUE; j++) {
            System.out.printf("%3c", coordinate[j]);
        }
        System.out.println();
    }

    /**
     * X축 및 눈금(숫자)을 그린다.
     */
    private static void drawXaxis() {
        System.out.printf("%3s", "+");
        for (int i = 0; i <= MAX_VALUE; i++) {
            System.out.printf("%3s", "___");
        }

        System.out.println();
        for (int i = 0; i <= MAX_VALUE; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
    }

    /**
     *  좌표를 배열의 index로 변환하는 과정을 거친다.
     */
    private static char[][] convertToArrayIndex(Shape shape) {
        List<Point> pointList = shape.getPointList();

        // 좌표평면을 배열의 index로 변환하는 과정을 거친다.
        char[][] coordinate = new char[MAX_VALUE + 1][MAX_VALUE + 1];
        for(int i = 0; i < MAX_VALUE; i++) Arrays.fill(coordinate[i], ' ');
        for (Point p : pointList) {
            int ix = 25 - p.getY();
            int iy = p.getX();
            coordinate[ix][iy] = '*';
        }
        return coordinate;
    }
}