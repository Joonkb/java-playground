package nextstep.blackjack.view;

public class OutputView {
    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void printByFormat(String msg, Object ... args) {
        String.format(msg, args);
    }
}
