package user;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private static final String DUPLICATE_NAME = "중복된 이름은 입력할 수 없습니다.";
    private List<Player> players;

    public Players() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(String name) {
        checkDuplicatePlayer(name);
        players.add(new Player(name));
    }

    private void checkDuplicatePlayer(String name) {
        for (Player player : players) {
            if (player.isSameName(name)) {
                throw new IllegalArgumentException(DUPLICATE_NAME);
            }
        }
    }
}
