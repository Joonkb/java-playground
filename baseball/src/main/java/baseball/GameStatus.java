package baseball;

public enum GameStatus {
    EXIT(2);

    private final int value;

    GameStatus(int status) {
        this.value = status;
    }

    public int getValue() {
        return this.value;
    }
};
