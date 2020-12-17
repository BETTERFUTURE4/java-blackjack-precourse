import card.CardFactory;
import card.Deck;
import user.PlayerController;
import view.InputView;

public class GameManager {
    public static void run(InputView inputView) {
        PlayerController playerController = new PlayerController();
        playerController.settingParticipant(inputView);

        Deck deck = new Deck(CardFactory.create());
        deck.shuffle();
    }
}
