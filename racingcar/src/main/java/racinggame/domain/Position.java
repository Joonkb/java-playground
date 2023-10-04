package racinggame.domain;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Position {
    private int position;

    public Position(int position) {
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
