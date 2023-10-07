package racinggame.domain;


public class Car {

    private Name name;
    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        position = new Position();
    }

    public Car(String name, int position) {
        this(name);
        this.position = new Position(position);
    }

    public void move(MovingStrategy strategy) {
        if (strategy.movable()) {
            position = position.move();
        }
    }

    public Position getPosition() {
        return position;
    }

    // 현재 위치정보를 기반으로 자동차이름과 : "-" 를 출력한다.
    public String getDescription() {
        StringBuilder description = new StringBuilder(name.getName());
        description.append(" : ");
        for (int i = 1; i <= position.getPosition(); ++i) {
            description.append("-");
        }
        return description.toString();
    }
}