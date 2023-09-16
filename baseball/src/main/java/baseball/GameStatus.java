package baseball;

public enum GameStatus {
    EXIT(2)
    , CONTINUE(1);

    private final int value;

    GameStatus(int status) {
        this.value = status;
    }

    public int getValue() {
        return this.value;
    }

    public static boolean isGameEnd(int value) {
        return value != GameStatus.EXIT.getValue();
    }
};
