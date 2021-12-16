package utils.validator;

import utils.Constants;

public class NameValidator {
	private final String name;

	public NameValidator(String name) {
		this.name = name;
		validate();
	}

	private void validate() {
		isRightString();
	}

	private void isRightString() {
		if (!Constants.NAME_PATTERN.matcher(name).matches()) {
			throw new IllegalArgumentException(Constants.ERROR_NAME_PATTERN);
		}
	}
}
