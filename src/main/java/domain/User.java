package domain;

import utils.validator.NameValidator;

public class User {
	public final String name;
	public Money money;
	public final Cards cards = new Cards();

	public User(String name) {
		new NameValidator(name);
		this.name = name;
	}

	public void initCardAppend() {
		cards.cardAppend(new Card());
		cards.cardAppend(new Card());
	}

	public void cardAppend() {
		cards.cardAppend(new Card());
	}

	public boolean equals(User obj) {
		// 모델값 같은지 확인
		return this.name.equals(obj.name);
	}

	@Override
	public String toString() {
		return name + ": " + money;
	}

	public String getCardStatus() {
		return name + " 카드: " + cards;
	}
}
