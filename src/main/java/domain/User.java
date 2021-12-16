package domain;

import utils.validator.NameValidator;

public class User {
	public final String name;
	public Money money;
	public Cards cards;

	public User(String name) {
		new NameValidator(name);
		this.name = name;
	}

	public boolean equals(User obj) {
		// 모델값 같은지 확인
		return this.name.equals(obj.name);
	}

	@Override
	public String toString() {
		return name + ": " + money;
	}
}
