package controller.view;

import domain.Money;
import domain.Users;
import utils.validator.AnswerValidator;
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
			Money money = new Money(InputView.inputUserMoney(userName));
			OutputView.printBreak();
			return money;
		} catch (IllegalArgumentException e) {
			OutputView.printError(e.getMessage());
			return getUserMoney(userName);
		}
	}

	public static String getAnswer(String userName) {
		try {
			String answer = InputView.inputAskCard(userName);
			new AnswerValidator(answer);
			OutputView.printBreak();
			return answer;
		} catch (IllegalArgumentException e) {
			OutputView.printError(e.getMessage());
			return getAnswer(userName);
		}
	}
}
