package card;

import user.Dealer;
import user.Player;
import user.User;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class CardController {
    private static final int INITIAL_CARD_NUMBER = 2;

    public void distributeTwoCardToDealer(Dealer dealer, Deck deck) {
        drawTwoCard(dealer, deck);
    }

    public void distributeTwoCardToPlayer(List<Player> players, Deck deck) {
        for (Player player : players) {
            drawTwoCard(player, deck);
        }
    }

    private void drawTwoCard(User user, Deck deck) {
        for (int i = 0; i < INITIAL_CARD_NUMBER; i++) {
            user.addCard(deck.draw());
        }
    }

    public void completeDrawTwoCards(Dealer dealer, List<Player> players) {
        List<String> allPlayerName = new ArrayList<>();

        for (Player player : players) {
            allPlayerName.add(player.getName());
        }

        OutputView.distributeTwoCards(allPlayerName);
        OutputView.printDealerCards(dealer);
        OutputView.printOneCard(dealer);
        OutputView.blankLine();
        for (Player player : players) {
            OutputView.printPlayerCards(player);
            OutputView.printAllCards(player);
            OutputView.blankLine();
        }
    }
}
