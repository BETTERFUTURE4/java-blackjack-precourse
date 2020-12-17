package user;

import money.BettingMoney;

import java.util.List;

public class UserService {

    public UserService() {
    }

    public void bettingMoney(Player player, BettingMoney bettingMoney) {
        player.betting(bettingMoney);
    }

    public void registerPlayer(Player player) {
        PlayerRepository.addPlayer(player);
    }

    public List<Player> getAllPlayers() {
        return PlayerRepository.allPlayers();
    }
}
