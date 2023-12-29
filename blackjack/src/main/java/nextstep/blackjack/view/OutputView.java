package nextstep.blackjack.view;

public class OutputView {

    private static final String DIVIDE_TWO_CARDS_MSG       =  "딜러와 %s에게 2장의 카드를 나누었습니다.";
    private static final String PARTICIPANTS_CARDS_STATUS  =  "%s카드 : %s";
    private static final String ASK_FOR_ONE_MORE_CARD_MSG  =  "%s는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)";
    private static final String HOW_MANY_CARD_RECEIVE_D    =  "\n딜러는 16이하라 %d장의 카드를 더 받았습니다.\n";
    private static final String DEALER_EXCEED_SCORE        =  "\n딜러는 17점 초과라 카드를 추가로 받지 않았습니다.\n";

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void printByFormat(String msg, Object ... args) {
        System.out.println(String.format(msg, args));
    }

    public static void printDivideTwoCards(String names) {
        printByFormat(DIVIDE_TWO_CARDS_MSG, names);
    }

    public static void printAskForOneMoreCard(String name) {
        printByFormat(ASK_FOR_ONE_MORE_CARD_MSG, name);
    }

    public static void printCurrentCardList(String name, String cardList) {
        printByFormat(PARTICIPANTS_CARDS_STATUS, name, cardList);
    }

    public static void printHowManyCardReceive(int receiveCount) {
        printByFormat(HOW_MANY_CARD_RECEIVE_D, receiveCount);
    }

    public static void printDealerExceededScore() {
        print(DEALER_EXCEED_SCORE);
    }
}