package nextstep.blackjack.view;

import nextstep.blackjack.domain.Dealer;
import nextstep.blackjack.domain.Deck;
import nextstep.blackjack.domain.Player;
import nextstep.blackjack.domain.User;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    public static void divideTwoCards(List<Player> players, User dealer, Deck deck) {

        String names = players.stream()
                .map(e-> e.getName())
                .collect(Collectors.joining(","));

        System.out.println("딜러와 " + names +"에게 두 장을 나누었습니다.");
        dealer.addCard(deck.getRandomCard());
        dealer.addCard(deck.getRandomCard());
        players.stream().forEach(player -> player.addCard(deck.getRandomCard()));
        players.stream().forEach(player -> player.addCard(deck.getRandomCard()));
    }

    public static void showUserScoreInfo(User dealer, List<Player> players) {
        System.out.println("딜러 카드: "  + dealer.showUserCards(52) + " - 결과: " + dealer.calculateCardScore());
        players.stream().forEach(player -> System.out.println(
                player.getName() + "카드: " +
                player.showUserCards(52) + " - 결과: " +
                player.calculateCardScore()));
    }

    /**
     * 최종 수익을 계산한다.
     */
    public static void calculateFinalProfit(User dealer, List<Player> players) {
        System.out.println("## 최종 수익");
        int cnt = 0;
        List<Integer> profits = players.stream()
                .map(player -> calculatePlayersPoint(dealer, player))
                .collect(Collectors.toList());
        Integer dealerProfit = profits.stream().reduce(Integer::sum).get() * -1;
        System.out.println("딜러: " + dealerProfit);
        for (Player player : players) {
            System.out.println(player.getName() + ": " + profits.get(cnt++));
        }
    }

    /**
     *   우선순위를 고려한 배팅금액 반환
     */
    public static Integer calculatePlayersPoint(User dealer, Player player) {

        boolean dealerAddedYn = dealer.hasTwoCardsYn();
        boolean playerAddedYn = player.hasTwoCardsYn();
        boolean dealerBlackJackYn  = dealer.isBlackJackScore();
        boolean playerBlackJackYn  = player.isBlackJackScore();

        /**  딜러, 플레이어 모두 카드 2장에 블랙잭인경우 **/
        if (dealerAddedYn && dealerBlackJackYn && playerAddedYn && playerBlackJackYn) {
            return player.getBettingAmount();
        }
        /**  플레이어가 처음받은 2장이 블랙잭인 경우  **/
        if (playerAddedYn && playerBlackJackYn) {
            return player.getBettingAmount() * 15 / 10;
        }
        /** 딜러의 점수가 21점을 초과한 경우 **/
        if (dealer.exceedBlackJackScoreYn()) {
            return player.getBettingAmount();
        }
        /** 플레이어의 점수가 21점을 초과한 경우 **/
        if (player.exceedBlackJackScoreYn()) {
            return player.getBettingAmount() * -1;
        }
        return player.getBettingAmount() * -1;
    }
}