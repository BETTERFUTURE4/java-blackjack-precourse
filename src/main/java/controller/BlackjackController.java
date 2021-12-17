package controller;

import controller.view.InputController;
import domain.Dealer;
import domain.Player;
import domain.repository.Repository;
import view.OutputView;

public class BlackjackController {
	public BlackjackController() {
		initiate();
		start();
		computeLoser();
		printResult();
	}

	private void printResult() {
		OutputView.printPlayerResult();
		OutputView.printPlayerMoneyResult();
	}

	private void initiate() {
		Repository.players = InputController.getUsers();
		OutputView.printBreak();
		Repository.players.get().forEach(user -> user.money = InputController.getUserMoney(user.name));
	}

	private void start() {
		Repository.DEALER.initCardAppend();
		Repository.players.get().forEach(Player::initCardAppend);
		OutputView.printInitMessage();
		goRound();
		dealerGoRound();
	}

	private void dealerGoRound() {
		if (Repository.DEALER.cards.getCardSum() <= 16) {
			Repository.DEALER.cardAppend();
			OutputView.printDealerGetCard();
		}
	}

	private void goRound() {
		OutputView.printDealerCards();
		OutputView.printUsersCards();
		for (Player player : Repository.players.get()) {
			userGoRound(player, 0);
		}
	}

	private void userGoRound(Player player, int repeatNum) {
		if (player.cards.getCardSum() < 21) {
			String answer = InputController.getAnswer(player.name);
			if (answer.equals("y")) {
				player.cardAppend();
				OutputView.printUserCards(player);
				userGoRound(player, repeatNum + 1);
				return;
			}
			if (repeatNum == 0) {
				OutputView.printUserCards(player);
			}
		}
	}

	private void computeLoser() {
		Dealer dealer = Repository.DEALER;
		int dealerSum = dealer.cards.getCardSum();
		if (dealerSum > 21) {
			dealerAllLose();
			return;
		}
		for (Player player : Repository.players.get()) {
			userDraw(player);
			userLose(player);
			userWin(player);
		}
	}
	private void dealerAllLose() {
		for (Player player : Repository.players.get()) {
			Repository.DEALER.setLose(player);
			player.setWin();
		}
	}

	private void userWin(Player player) {
		Dealer dealer = Repository.DEALER;
		int dealerSum = dealer.cards.getCardSum();
		if (player.cards.getCardSum() > dealerSum) {
			dealer.setLose(player);
			player.setWin();
		}
		if (player.cards.isTwoCard() && player.cards.getCardSum() == 21) {
			dealer.setBlackjackLose(player);
			player.setBlackjackWin();
		}
	}

	private void userLose(Player player) {
		Dealer dealer = Repository.DEALER;
		int dealerSum = dealer.cards.getCardSum();
		if (player.cards.getCardSum() > 21 || player.cards.getCardSum() < dealerSum) {
			dealer.setWin(player);
			player.setLose();
		}
	}

	private void userDraw(Player player) {
		Dealer dealer = Repository.DEALER;
		int dealerSum = dealer.cards.getCardSum();
		if (player.cards.getCardSum() == dealerSum) {
			player.setDraw();
		}
	}
}
