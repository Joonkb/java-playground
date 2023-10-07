package racinggame.domain;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Position {
    private int position;

    public Position() {
        position = 1;
    }

    public Position(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("위치는 음수일 수 없습니다.");
        }
        this.position = position;
    }

    public Position move() {
        position += 1;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
