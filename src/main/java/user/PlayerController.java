package user;

import money.BettingMoney;
import util.StringDivider;
import view.InputView;
import view.OutputView;

import java.math.BigDecimal;
import java.util.List;

public class PlayerController {
    private UserService userService;

    public PlayerController() {
        this.userService = new UserService();
    }

    public void settingParticipant(InputView inputView) {
        List<String> names = getParticipantNames(inputView);
        for (String name : names) {
            Player player = new Player(name);
            BettingMoney bettingMoney = getBettingMoney(name, inputView);
            userService.bettingMoney(player, bettingMoney);
            userService.registerPlayer(player);
        }
    }

    private List<String> getParticipantNames(InputView inputView) {
        OutputView.askParticipantName();
        String names = inputView.participantName();
        return StringDivider.divideStringComma(names);
    }

    private BettingMoney getBettingMoney(String name, InputView inputView) {
        OutputView.askBettingMoney(name);
        String money = inputView.bettingMoney();
        return new BettingMoney(money);
    }
}
