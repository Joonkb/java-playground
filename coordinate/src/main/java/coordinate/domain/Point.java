package coordinate.domain;

public class Point {

    public static final int MAX_VALUE = 24;
    private int x;
    private int y;

    public Point(int x, int y) {
        validateInputValue(x, y);
        this.x = x;
        this.y = y;
    }

    private void validateInputValue(int x, int y) {
        if (x < 0 || x > MAX_VALUE || y < 0 || y > MAX_VALUE) {
            throw new IllegalStateException("X, Y좌표 모두 최대 24까지만 입력할 수 있습니다.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
