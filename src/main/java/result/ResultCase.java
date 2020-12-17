package result;

import user.Dealer;
import user.Player;
import user.User;

import java.util.Arrays;
import java.util.function.BiPredicate;

public enum ResultCase {
    BLACKJACK_WIN("1.5", (User player, User dealer) -> (
            player.isBlackJack() && !dealer.isBlackJack()
    )),
    DRAW("0", (User player, User dealer) -> (
            player.isDraw(dealer)
    )),
    WIN("1.0", (User player, User dealer) -> (
            player.isWin(dealer)
    )),
    LOSE("-1.0", (User player, User dealer) -> (
            !player.isWin(dealer)
    )),
    BLACKJACK_LOSE("-1.5", (User player, User dealer) -> (
            !player.isBlackJack() && dealer.isBlackJack()
    ));

    private String resultCase;
    private BiPredicate<User, User> checkCase;

    ResultCase(String resultCase, BiPredicate<User, User> checkCase) {
        this.resultCase = resultCase;
        this.checkCase = checkCase;
    }

    public String getCaseRate() {
        return resultCase;
    }

    public static ResultCase getResult(Player player, Dealer dealer) {
        return Arrays.stream(ResultCase.values())
                .filter(c -> c.checkCase.test(player, dealer))
                .findFirst()
                .orElse(LOSE);
    }
}
