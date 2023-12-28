package nextstep.blackjack.utils;


public final class CCM {

    public static final String YES = _value("Y");
    public static final String NO = _value("N");

    public static final int BUST_SCORE = _value(21);

    private static final <T> T _value(T t) {
        return t;
    }
}
