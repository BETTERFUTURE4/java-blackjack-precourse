package user;

import money.BettingMoney;

import java.math.BigDecimal;

/**
 * 게임 참여자를 의미하는 객체
 */
public class Player extends User{
    private static final int BLACK_JACK = 21;
    private static final String IS_EMPTY_NAME = "이름으로 공백을 입력할 수 없습니다.";
    private static final String IS_DUPLICATE_NAME = "중복된 이름을 입력할 수 없습니다.";

    private final String name;
    private BettingMoney bettingMoney;

    public Player(String name) {
        validateName(name);
        this.name = name;
        this.bettingMoney = new BettingMoney(new BigDecimal("0"));
    }

    public String getName() {
        return name;
    }

    private void validateName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException(IS_EMPTY_NAME);
        }
        if (PlayerRepository.findByName(name) != null) {
            throw new IllegalArgumentException(IS_DUPLICATE_NAME);
        }
    }

    public void betting(BettingMoney money) {
        this.bettingMoney = bettingMoney.addMoney(money);
    }

    public boolean canDraw() {
        return getScore() < BLACK_JACK;
    }
}
