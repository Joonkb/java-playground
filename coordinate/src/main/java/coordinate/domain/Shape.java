package coordinate.domain;

import java.util.List;

/**
 * 추상화를 할때 이것을 interface로 추상화 해야할지,
 *                      아니면 abstract로 추상화를 해야할지 고민이 됨..
 *
 * 처음에는 interface로 정의하였으나, 공통적으로 points를 관리하기 위해 abstract 추상클래스로 변경
 */
public abstract class Shape {

    // 굳이 일급컬렉션인 Points 클래스를 멤버변수로??
    // List<Point>를 멤버변수로 하면 안되나??
    protected Points points;

    public Shape(Points points) {
        this.points = points;
    }

    public Points getPoints() {
        return this.points;
    }

    public List<Point> getPointList() {
        return points.getPoints();
    }

    public abstract Double getArea();
}
