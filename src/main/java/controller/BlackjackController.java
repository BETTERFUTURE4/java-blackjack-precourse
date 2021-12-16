package controller;

import controller.view.InputController;
import domain.Users;

public class BlackjackController {
	public BlackjackController() {
		initiate();
		start();
	}
	private void initiate() {
		Users users = InputController.getNames();
		System.out.println(users);
	}

	private void start() {
		// 작동 시작
	}
}
