package user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerRepository {
    private static final List<Player> players = new ArrayList<>();

    public static List<Player> allPlayers() {
        return Collections.unmodifiableList(players);
    }

    public static void addPlayer(Player player) {
        players.add(player);
    }

    public static Player findByName(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }
}
