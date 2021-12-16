package controller;

import controller.view.InputController;
import domain.User;
import domain.repository.Repository;
import view.OutputView;

public class BlackjackController {
	public BlackjackController() {
		initiate();
		start();
	}
	private void initiate() {
		Repository.users = InputController.getUsers();
		Repository.users.get().forEach(user -> user.money = InputController.getUserMoney(user.name));
		System.out.println(Repository.users);

		// 카드받는 여부 확인하는 함수
		// users.get().forEach(user -> System.out.println(InputController.getAnswer(user.name)));

	}

	private void start() {
		// 작동 시작
		Repository.DEALER.initCardAppend();
		Repository.users.get().forEach(User::initCardAppend);
		goRound();
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
}
