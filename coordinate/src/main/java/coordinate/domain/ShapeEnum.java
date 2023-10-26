package coordinate.domain;

public enum ShapeEnum {

    LINE(2),
    SQUARE(3),
    TRIANGLE(4);

    private int points;

    ShapeEnum(int points) {
        this.points = points;
    }

}
