import card.CardController;
import card.CardFactory;
import card.Deck;
import user.Dealer;
import user.Player;
import user.PlayerController;
import view.InputView;
import view.OutputView;

import java.util.List;

public class GameManager {
    private static final String YES = "y";

    public static void run(InputView inputView) {
        PlayerController playerController = new PlayerController();
        playerController.settingParticipant(inputView);

        Deck deck = new Deck(CardFactory.create());
        deck.shuffle();

        Dealer dealer = new Dealer();
        List<Player> players = playerController.getAllPlayer();

        distributeInitialCard(dealer, players, deck);
        askPlayersDrawCard(players, deck, inputView);
    }

    private static void distributeInitialCard(Dealer dealer, List<Player> players, Deck deck) {
        CardController cardController = new CardController();
        cardController.distributeTwoCardToDealer(dealer, deck);
        cardController.distributeTwoCardToPlayer(players, deck);
        cardController.completeDrawTwoCards(dealer, players);
    }

    private static void askPlayersDrawCard(List<Player> players, Deck deck, InputView inputView) {
        for (Player player : players) {
            askPlayerDrawCard(player, deck, inputView);
        }
    }

    private static void askPlayerDrawCard(Player player, Deck deck, InputView inputView) {
        while(willDrawCard(player, inputView)) {
            player.addCard(deck.draw());
            OutputView.printPlayerCards(player);
        }
    }

    private static boolean willDrawCard(Player player, InputView inputView) {
        OutputView.askDrawCard(player);
        String answer = inputView.willDraw();
        return answer.equals(YES) && player.canDraw();
    }
}
