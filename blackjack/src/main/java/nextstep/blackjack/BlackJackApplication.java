package nextstep.blackjack;

import nextstep.blackjack.controller.BlackjackController;

public class BlackJackApplication {
    public static void main(String[] args) {
        BlackjackController controller = new BlackjackController();
        controller.start();
    }
}
