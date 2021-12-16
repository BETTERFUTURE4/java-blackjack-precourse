package controller;

import controller.view.InputController;
import domain.Users;

public class BlackjackController {
	public BlackjackController() {
		initiate();
		start();
	}
	private void initiate() {
		Users users = InputController.getUsers();
		users.get().forEach(user -> user.money = InputController.getUserMoney(user.name));
		System.out.println(users);

		// 카드받는 여부 확인하는 함수
		// users.get().forEach(user -> System.out.println(InputController.getAnswer(user.name)));

	}

	private void start() {
		// 작동 시작
	}
}
