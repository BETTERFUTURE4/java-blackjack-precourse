import card.CardController;
import card.CardFactory;
import card.Deck;
import result.ResultCase;
import user.Dealer;
import user.Player;
import user.PlayerController;
import view.InputView;
import view.OutputView;

import java.math.BigDecimal;
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
        checkDealerCard(dealer, deck);

        showResult(dealer, players);
        calculateProfit(dealer, players);
        printFinalProfit(dealer, players);
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
            OutputView.printAllCards(player);
            OutputView.blankLine();
        }
    }

    private static boolean willDrawCard(Player player, InputView inputView) {
        return player.canDraw() && askToPlayer(player, inputView);
    }

    private static boolean askToPlayer(Player player, InputView inputView) {
        OutputView.askDrawCard(player);
        String answer = inputView.willDraw();
        return answer.equals(YES);
    }

    private static void checkDealerCard(Dealer dealer, Deck deck) {
        while (dealer.canDraw()) {
            dealer.addCard(deck.draw());
            OutputView.noticeDealerDrawCard();
        }
    }

    private static void showResult(Dealer dealer, List<Player> players) {
        showDealerCards(dealer);
        showPlayersCards(players);
    }

    private static void showDealerCards(Dealer dealer) {
        OutputView.printDealerCards(dealer);
        OutputView.printAllCards(dealer);
        OutputView.printScore(dealer.getFinalScore());
    }

    private static void showPlayersCards(List<Player> players) {
        for (Player player : players) {
            showPlayerCard(player);
        }
    }

    private static void showPlayerCard(Player player) {
        OutputView.printPlayerCards(player);
        OutputView.printAllCards(player);
        OutputView.printScore(player.getFinalScore());
    }

    private static void calculateProfit(Dealer dealer, List<Player> players) {
        for (Player player : players) {
            calculateEachPlayerResult(player, dealer);
        }
    }

    private static void calculateEachPlayerResult(Player player, Dealer dealer) {
        ResultCase result = ResultCase.getResult(player, dealer);
        String rate = result.getCaseRate();
        BigDecimal playerProfitRate = new BigDecimal(rate);
        player.addProfit("1", playerProfitRate);
        dealer.addProfit("-1", playerProfitRate, player.getBettingMoney());
    }

    private static void printFinalProfit(Dealer dealer, List<Player> players) {
        OutputView.printFinalProfitTitle();
        OutputView.showDealerProfit(dealer.getProfit());
        for (Player player : players) {
            OutputView.showPlayerProfit(player.getName(), player.getProfit());
        }
    }

}
