package user;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private List<Player> players;

    public Players() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
