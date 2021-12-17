package view;

import domain.Player;
import domain.repository.Repository;

public class OutputView {
	public static final String DEALER_ADD_CARD = "딜러는 16이하라 한 장의 카드를 더 받았습니다.";
	public static final String PLAYER_INIT_MESSAGE = "딜러와 %s에게 2장을 나누었습니다.\n";
	public static final String RESULT_STRING = "## 최종 수익";
	public static final String RESULT = "%s - 결과 : %d\n";

	public static void printInitMessage() {
		System.out.printf(PLAYER_INIT_MESSAGE, Repository.players);
	}

	public static void printDealerCards() {
		System.out.println(Repository.DEALER.getCardStatus());
	}

	public static void printUsersCards() {
		Repository.players.get().forEach(user -> System.out.println(user.getCardStatus()));
		printBreak();
	}

	public static void printUserCards(Player player) {
		System.out.println(player.getCardStatus());
		printBreak();
	}

	public static void printBreak() {
		System.out.println();
	}

	public static void printError(String message) {
		System.out.println(message);
		printBreak();
	}

	public static void printDealerGetCard() {
		System.out.println(DEALER_ADD_CARD);
		printBreak();
	}

	public static void printPlayerMoneyResult() {
		System.out.println(RESULT_STRING);
		System.out.println(Repository.DEALER);
		Repository.players.get().forEach(System.out::println);
		printBreak();
	}

	public static void printPlayerResult() {
		System.out.printf(RESULT, Repository.DEALER.getCardStatus(), Repository.DEALER.cards.getCardSum());
		Repository.players.get()
			.forEach(user -> System.out.printf(RESULT, user.getCardStatus(), user.cards.getCardSum()));
		printBreak();
	}
}
