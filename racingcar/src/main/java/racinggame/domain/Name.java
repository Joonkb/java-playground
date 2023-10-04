package racinggame.domain;

import lombok.Getter;

@Getter
public class Name {

    public static final int MAX_LENGTH = 5;

    private String name;

    public Name(String name) {
        validateCarName(name);
        this.name = name;
    }

    private void validateCarName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("자동차 이름은 공백이거나 null 일 수 없습니다.");
        }
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5글자를 초과할 수 없습니다.");
        }
    }

}
