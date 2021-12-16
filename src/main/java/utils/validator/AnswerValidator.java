package utils.validator;

import utils.Constants;

public class AnswerValidator {
	private final String answer;

	public AnswerValidator(String answer) {
		this.answer = answer;
		validate();
	}

	private void validate() {
		isRightString();
	}

	private void isRightString() {
		if (!Constants.ASK_PATTERN.matcher(answer).matches()) {
			throw new IllegalArgumentException(Constants.ERROR_ASK_PATTERN);
		}
	}
}
