package coordinate.domain;

import coordinate.utils.PointCalculator;

import java.util.List;

public class Line implements Shape {

    // 굳이 일급컬렉션인 Points 클래스를 멤버변수로??
    // List<Point>를 멤버변수로 하면 안되나??
    private Points points;

    public Line(Points points) {
        this.points = points;
    }

    public Line(List<Point> pointList) {
        points = new Points(pointList);
    }

    public Points getPoints() {
        return points;
    }

    @Override
    public Double getArea() {
        return PointCalculator.getArea(this);
    }
}