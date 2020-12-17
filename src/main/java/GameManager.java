import card.CardController;
import card.CardFactory;
import card.Deck;
import user.Dealer;
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

        Dealer dealer = new Dealer();
        List<Player> players = playerController.getAllPlayer();

        CardController cardController = new CardController();
        cardController.distributeTwoCardToDealer(dealer, deck);
        cardController.distributeTwoCardToPlayer(players, deck);
        cardController.completeDrawTwoCards(dealer, players);
    }
}
