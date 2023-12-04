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
            return 0;
        }
        /** 딜러, 플레이어 모두 블랙잭인 경우 **/
        if (dealerBlackJackYn && playerBlackJackYn) {
            return 0;
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
        /** 플레이어의 점수가 블랙잭 점수에 더 가까운 경우**/
        if(dealer.calculateCardScore() < player.calculateCardScore()){
            return player.getBettingAmount() * 1;
        }
        /** 딜러의 점수와 플레이어의 점수가 같은 경우**/
        if(dealer.calculateCardScore() == player.calculateCardScore()){
            return 0;
        }
        return player.getBettingAmount() * -1;
    }
}