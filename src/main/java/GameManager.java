import card.CardFactory;
import card.Deck;
import user.Player;
import user.PlayerController;
import view.InputView;

import java.util.List;

public class GameManager {
    public static void run(InputView inputView) {
        PlayerController playerController = new PlayerController();
        playerController.settingParticipant(inputView);

        Deck deck = new Deck(CardFactory.create());
        deck.shuffle();

        List<Player> players = playerController.getAllPlayer();
    }
}
