package money;

import java.math.BigDecimal;

public class BettingMoney {
    private static final String NO_NUMBER = "양의 정수만 입력할 수 있습니다.";

    private BigDecimal bettingMoney;

    public BettingMoney(String money) {
        validateMoney(money);
        this.bettingMoney = new BigDecimal(money);
    }

    public BettingMoney(BigDecimal money) {
        this.bettingMoney = money;
    }
    public BigDecimal getBettingMoney() {
        return bettingMoney;
    }

    private void validateMoney(String money) {
        for (int i = 0; i < money.length(); i++) {
            char digit = money.charAt(i);
            if (!Character.isDigit(digit)) {
                throw new IllegalArgumentException(NO_NUMBER);
            }
        }
    }

    public BettingMoney addMoney(BettingMoney money) {
        return new BettingMoney(this.bettingMoney.add(money.getBettingMoney()));
    }
}
