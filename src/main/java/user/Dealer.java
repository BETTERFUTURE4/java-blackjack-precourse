package user;

import card.Card;
import money.BettingMoney;

import java.math.BigDecimal;

/**
 * 게임 딜러를 의미하는 객체
 */
public class Dealer extends User{
    private static final int FIRST_CARD_INDEX = 0;
    private static final int DRAW_BASE_POINT = 16;

    public Dealer() {}

    public String getFirstCard() {
        Card firstCard = getCards().get(FIRST_CARD_INDEX);
        return firstCard.getInformation();
    }

    @Override
    public boolean canDraw() {
        return getScore() <= DRAW_BASE_POINT;
    }

    public void addProfit(String i, BigDecimal playerProfitRate, BettingMoney money) {
        BigDecimal temp = new BigDecimal(i);
        BigDecimal profitRate = playerProfitRate.multiply(temp);
        BigDecimal bettingMoney = money.getBettingMoney();
        updateProfit(bettingMoney.multiply(profitRate));
    }
}
