package coordinate.domain;

public enum ShapeEnum {

    LINE("Line"),
    SQUARE("Square"),
    TRIANGLE("Triangle");

    private String type;
    ShapeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
