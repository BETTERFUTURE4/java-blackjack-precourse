package user;

import money.BettingMoney;

public class UserService {

    public UserService() {
    }

    public void bettingMoney(Player player, BettingMoney bettingMoney) {
        player.betting(bettingMoney);
    }

    public void registerPlayer(Player player) {
        PlayerRepository.addPlayer(player);
    }
}
