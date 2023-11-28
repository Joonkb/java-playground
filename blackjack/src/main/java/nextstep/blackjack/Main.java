package nextstep.blackjack;

import nextstep.blackjack.domain.*;
import nextstep.blackjack.view.ResultView;

import java.util.Arrays;
import java.util.List;

import static nextstep.blackjack.utils.ParsingUtils.parse;
import static nextstep.blackjack.view.InputView.*;
import static nextstep.blackjack.view.ResultView.*;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();

        /**  플레이어 베팅금액 입력 **/
        List<Player> players = parse(getPlayerName());
        getPlayerBettingAmount(players);
        
        /**  딜러, 플레이어 2장의 카드 분배  **/
        User dealer = new Dealer();
        divideTwoCards(players, dealer, deck);

        /**  딜러, 플레이어 카드정보 출력  **/
        System.out.print("딜러: "); System.out.println(dealer.showUserCards(1));
        players.stream().forEach(player -> System.out.println(player.getName() +": "+ player.showUserCards(2)));

        /** 카드 한장을 받을지, 말지 결정한다. **/
        askForCardReceiveOrNot(players, dealer, deck);

        /** 최종 결과를 출력한다. **/
        showUserScoreInfo(dealer, players);

        /** 최종 수익을 계산한다. **/
        calculateFinalProfit(dealer, players);
    }
}
