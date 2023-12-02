package nextstep.blackjack.domain;

public interface CalcStrategy {
    Integer calculatePlayersPoint(User dealer, Player player);
}