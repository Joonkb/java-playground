package coordinate.view;

import coordinate.domain.Point;
import coordinate.domain.Points;
import coordinate.domain.Shape;

import java.util.Arrays;
import java.util.List;

public class DrawView {

    public static void drawCoordinate(Shape shape) {
        char[][] coordinate =  convertToArrayIndex(shape);

        for (int i = 24; i > 0; i--) {
            if (i % 2 == 0) System.out.printf("%2d", i);
            else System.out.printf("%2s", " ");
            System.out.printf("|");
            for (int j = 0; j <= 24; j++) {
                System.out.printf("%3c", coordinate[i][j]);
            }
            System.out.println();
        }

        System.out.printf("%3s", "+");
        for (int i = 0; i <= 24; i++) {
            System.out.printf("%2s", "---");
        }
        System.out.println();
        for (int i = 0; i <= 24; i++) {
            System.out.printf("%3d", i);
        }
    }

    /**
     *  좌표평면을 좌표를 배열의 index로 변환하는 과정을 거친다.
     */
    private static char[][] convertToArrayIndex(Shape shape) {

        List<Point> pointList = shape.getPointList();

        // 좌표평면을 배열의 index로 변환하는 과정을 거친다.
        char[][] coordinate = new char[25][25];
        for(int i = 0; i < 24; i++) Arrays.fill(coordinate[i], ' ');

        for (Point p : pointList) {
            int ix = 25 - p.getY();
            int iy = p.getX();
            coordinate[ix][iy] = '*';
        }
        return coordinate;
    }

}
