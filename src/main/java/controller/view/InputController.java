package controller.view;

import domain.Users;
import view.InputView;
import view.OutputView;

public class InputController {

	public static Users getNames() {
		try {
			return new Users(InputView.inputNames());
		} catch (IllegalArgumentException e) {
			OutputView.printError(e.getMessage());
			return getNames();
		}
	}
}
