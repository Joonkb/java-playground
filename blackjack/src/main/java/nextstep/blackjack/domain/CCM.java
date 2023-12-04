package nextstep.blackjack.domain;

/**
 *  CCM 클래스는
 *  공통 상수를 관리하는 클래스이다.
 */
public class CCM {

    public static String YES = CCM._value("y");
    public static String NO = CCM._value("n");

    private static final <T> T _value(T v) {
        return v;
    }
}
