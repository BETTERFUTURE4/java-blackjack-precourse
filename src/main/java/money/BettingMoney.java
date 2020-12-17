package money;

import java.math.BigDecimal;

public class BettingMoney {
    private BigDecimal bettingMoney;

    public BettingMoney(BigDecimal money) {
        this.bettingMoney = money;
    }

    public BigDecimal getBettingMoney() {
        return bettingMoney;
    }

    public BettingMoney addMoney(BettingMoney money) {
        return new BettingMoney(this.bettingMoney.add(money.getBettingMoney()));
    }
}
