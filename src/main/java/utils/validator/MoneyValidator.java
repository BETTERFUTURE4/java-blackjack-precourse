package utils.validator;

import utils.Constants;

public class MoneyValidator {
	private final String moneyString;

	public MoneyValidator(String moneyString) {
		this.moneyString = moneyString;
		validate();
	}

	private void validate() {
		isRightString();
	}

	private void isRightString() {
		if (!Constants.MONEY_PATTERN.matcher(moneyString).matches()) {
			throw new IllegalArgumentException(Constants.ERROR_MONEY_PATTERN);
		}
	}
}
