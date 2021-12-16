package controller.view;

import domain.Money;
import domain.Users;
import view.InputView;
import view.OutputView;

public class InputController {

	public static Users getUsers() {
		try {
			return new Users(InputView.inputNames());
		} catch (IllegalArgumentException e) {
			OutputView.printError(e.getMessage());
			return getUsers();
		}
	}

	public static Money getUserMoney(String userName) {
		try {
			return new Money(InputView.inputUserMoney(userName));
		} catch (IllegalArgumentException e) {
			OutputView.printError(e.getMessage());
			return getUserMoney(userName);
		}
	}
}
