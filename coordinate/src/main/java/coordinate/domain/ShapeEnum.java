package coordinate.domain;

public enum ShapeEnum {

    LINE("Line", "두 점 사이 거리는 "),
    SQUARE("Square", "사각형의 넓이는 "),
    TRIANGLE("Triangle", "삼각형의 넓이는 ");

    private String type;
    private String hangulDesc;

    ShapeEnum(String type, String hangulDesc) {
        this.type = type;
        this.hangulDesc = hangulDesc;
    }
}
