package user;

/**
 * 게임 참여자를 의미하는 객체
 */
public class Player extends User{
    private static final String IS_EMPTY_NAME = "이름으로 공백을 입력할 수 없습니다.";

    private final String name;
    private double bettingMoney;

    public Player(String name) {
        validateName(name);
        this.name = name;
    }

    public Player(String name, double bettingMoney) {
        validateName(name);
        this.name = name;
        this.bettingMoney = bettingMoney;
    }

    private void validateName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException(IS_EMPTY_NAME);
        }
    }

    public boolean isSameName(String name) {
        return this.name.equals(name);
    }
}
