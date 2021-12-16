package controller;

import controller.view.InputController;
import domain.User;
import domain.repository.Repository;

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
		System.out.println(Repository.DEALER.getCardStatus());
		Repository.users.get().forEach(user -> System.out.println(user.getCardStatus()));
	}
}
