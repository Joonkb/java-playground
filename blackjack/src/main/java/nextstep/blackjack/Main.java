package nextstep.blackjack;

import nextstep.blackjack.domain.*;

import java.util.List;

import static nextstep.blackjack.utils.GameManager.askForCardReceiveOrNot;
import static nextstep.blackjack.utils.GameManager.divideTwoCards;
import static nextstep.blackjack.utils.ParsingUtils.parse;
import static nextstep.blackjack.view.InputView.*;
import static nextstep.blackjack.view.ResultView.*;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();

        /**  플레이어 베팅금액 입력 **/
        List<Player> players = parse(getPlayerName());
        getPlayerBettingAmount(players);
        
        /**  딜러 플레이어에게 2장의 카드 분배  **/
        User dealer = new Dealer();
        divideTwoCards(players, dealer, deck);

        /**  딜러, 플레이어 카드정보 출력  **/
        showUserCardInfo(dealer, players);

        /** 카드 한장을 받을지, 말지 결정한다. **/
        askForCardReceiveOrNot(players, dealer, deck);

        /** 최종 결과를 출력한다. **/
        showUserScoreInfo(dealer, players);

        /** 최종 수익을 계산한다. **/
        calculateFinalProfit(dealer, players);
    }
}
