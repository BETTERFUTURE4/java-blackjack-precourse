package domain;

import utils.validator.NameValidator;

public class User {
	public final String name;
	public Money money;

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
		// 프린트 원하는 방식으로 구현
		return name + ": " + money;
	}
}
