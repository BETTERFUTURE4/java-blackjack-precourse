package utils.validator;

import java.util.List;

import utils.Constants;
import utils.Converter;

public class NamesValidator {
	private final String names;

	public NamesValidator(String names) {
		this.names = names;
		validate();
	}

	private void validate() {
		isRightString();
		isDuplicated();
	}

	private void isRightString() {
		if (!Constants.NAMES_PATTERN.matcher(names).matches()) {
			throw new IllegalArgumentException(Constants.ERROR_NAMES_PATTERN);
		}
	}

	private void isDuplicated() {
		List<String> nameList = Converter.getNameSplit(names);
		if (nameList.size() != nameList.stream().distinct().count()) {
			throw new IllegalArgumentException(Constants.ERROR_NAMES_DUPLICATED_PATTERN);
		}
	}
}
