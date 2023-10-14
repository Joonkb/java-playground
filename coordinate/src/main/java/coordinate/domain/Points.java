package coordinate.domain;

import java.util.List;

public class Points {

    // 일급 컬렉션으로 어떤 기능을 할 수 있을까?
    private final List<Point> points;

    public Points(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }
}
