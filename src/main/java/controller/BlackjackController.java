package controller;

import controller.view.InputController;
import domain.Dealer;
import domain.User;
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
		Repository.users = InputController.getUsers();
		OutputView.printBreak();
		Repository.users.get().forEach(user -> user.money = InputController.getUserMoney(user.name));
	}

	private void start() {
		// 작동 시작
		Repository.DEALER.initCardAppend();
		Repository.users.get().forEach(User::initCardAppend);
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
		for (User user : Repository.users.get()) {
			userGoRound(user, 0);
		}
	}

	private void userGoRound(User user, int repeatNum) {
		if (user.cards.getCardSum() < 21) {
			String answer = InputController.getAnswer(user.name);
			if (answer.equals("y")) {
				user.cardAppend();
				OutputView.printUserCards(user);
				userGoRound(user, repeatNum + 1);
				return;
			}
			if (repeatNum == 0) {
				OutputView.printUserCards(user);
			}
		}
	}

	private void computeLoser() {
		Dealer dealer = Repository.DEALER;
		int dealerSum = dealer.cards.getCardSum();
		if (dealerSum > 21) {
			for (User user : Repository.users.get()) {
				dealer.setLose(user);
				user.setWin();
			}
			return;
		}
		for (User user : Repository.users.get()) {
			if (user.cards.getCardSum() == dealerSum) {
				user.setDraw();
				continue;
			}
			if (user.cards.getCardSum() > 21 || user.cards.getCardSum() < dealerSum) {
				dealer.setWin(user);
				user.setLose();
				continue;
			}
			if (user.cards.getCardSum() > dealerSum) {
				dealer.setLose(user);
				user.setWin();
				continue;
			}
			if (user.cards.isTwoCard() && user.cards.getCardSum() == 21) {
				dealer.setBlackjackLose(user);
				user.setBlackjackWin();
			}
		}
	}
}
