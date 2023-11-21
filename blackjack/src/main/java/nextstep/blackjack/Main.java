package nextstep.blackjack;

import nextstep.blackjack.domain.Dealer;
import nextstep.blackjack.domain.Player;
import nextstep.blackjack.domain.User;

import java.util.List;

import static nextstep.blackjack.utils.ParsingUtils.parse;
import static nextstep.blackjack.view.InputView.*;

public class Main {
    public static void main(String[] args) {
        /***************************
         * 플레이어들 배팅금액 세팅.
         ***************************/
        List<Player> players = parse(getPlayerName());
        getPlayerBettingAmount(players);

        User delear = new Dealer();

        players.stream().

    }
}
