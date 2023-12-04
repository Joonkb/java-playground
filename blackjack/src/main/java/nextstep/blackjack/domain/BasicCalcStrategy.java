package nextstep.blackjack.domain;

public class BasicCalcStrategy implements CalcStrategy {

    @Override
    public  Integer calculatePlayersPoint(User dealer, Player player) {

        boolean dealerAddedYn       = dealer.hasTwoCardsYn();
        boolean playerAddedYn       = player.hasTwoCardsYn();
        boolean dealerBlackJackYn   = dealer.isBlackJackScore();
        boolean playerBlackJackYn   = player.isBlackJackScore();

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