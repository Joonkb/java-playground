package nextstep.blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalcStrategyTest {

    private static CalcStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new BasicCalcStrategy();
    }

    @Test
    @DisplayName("딜러2장 블랙잭 & 플레이어2장 블랙잭")
    void 최종수익계산_CASE001() {

        Integer bettingAmt = 100000;

        Player player = new Player(bettingAmt, "KBJ");
        User   dealer = new Dealer();
        player.addCards(Arrays.asList(CardEnum.CLUB_A, CardEnum.CLUB_J));           // 21점
        dealer.addCards(Arrays.asList(CardEnum.SPADE_A, CardEnum.SPADE_J));         // 21점

        Assertions.assertThat(strategy.calculatePlayersPoint(dealer, player)).isEqualTo(bettingAmt * 0);
    }

    @Test
    @DisplayName("플레이어2장 블랙잭")
    void 최종수익계산_CASE_02() {

        Integer bettingAmt = 100000;

        Player player = new Player(bettingAmt, "KBJ");
        User   dealer = new Dealer();
        player.addCards(Arrays.asList(CardEnum.CLUB_A, CardEnum.CLUB_J));           // 21점
        dealer.addCards(Arrays.asList(CardEnum.SPADE_A, CardEnum.SPADE_3));         // 14점

        Assertions.assertThat(strategy.calculatePlayersPoint(dealer, player)).isEqualTo(bettingAmt * 15 / 10);
    }

    @Test
    @DisplayName("딜러점수 21점 초과")
    void 최종수익계산_CASE_03() {

        Integer bettingAmt = 100000;

        Player player = new Player(bettingAmt, "KBJ");
        User   dealer = new Dealer();
        player.addCards(Arrays.asList(CardEnum.CLUB_A, CardEnum.CLUB_3));                               // 14점
        dealer.addCards(Arrays.asList(CardEnum.SPADE_J, CardEnum.DIAMOND_J, CardEnum.SPADE_3));          // 23점

        Assertions.assertThat(strategy.calculatePlayersPoint(dealer, player)).isEqualTo(bettingAmt);
    }

    @Test
    @DisplayName("플레이어 점수 21점 초과")
    void 최종수익계산_CASE_04() {

        Integer bettingAmt = 100000;

        Player player = new Player(bettingAmt, "KBJ");
        User   dealer = new Dealer();
        player.addCards(Arrays.asList(CardEnum.CLUB_J, CardEnum.SPADE_J, CardEnum.CLUB_6)); // 26점
        dealer.addCards(Arrays.asList(CardEnum.SPADE_J, CardEnum.DIAMOND_J));               // 20점

        Assertions.assertThat(strategy.calculatePlayersPoint(dealer, player)).isEqualTo(bettingAmt * -1);
    }

    @Test
    @DisplayName("플레이어 점수가 블랙잭 점수에 더 가까운 경우 ex) 17 < 20")
    void 최종수익계산_CASE_05() {

        Integer bettingAmt = 100000;

        Player player = new Player(bettingAmt, "KBJ");
        User   dealer = new Dealer();
        player.addCards(Arrays.asList(CardEnum.CLUB_J, CardEnum.SPADE_J));     // 20점
        dealer.addCards(Arrays.asList(CardEnum.SPADE_J, CardEnum.DIAMOND_7));  // 17점

        Assertions.assertThat(strategy.calculatePlayersPoint(dealer, player)).isEqualTo(bettingAmt);
    }

    @Test
    @DisplayName("")
    void 최종수익계산_CASE_06() {

        Integer bettingAmt = 100000;

        Player player = new Player(bettingAmt, "KBJ");
        User   dealer = new Dealer();
        player.addCards(Arrays.asList(CardEnum.CLUB_J, CardEnum.SPADE_7));     // 20점
        dealer.addCards(Arrays.asList(CardEnum.SPADE_J, CardEnum.DIAMOND_7));  // 17점

        Assertions.assertThat(strategy.calculatePlayersPoint(dealer, player)).isEqualTo(bettingAmt * 0);
    }
}