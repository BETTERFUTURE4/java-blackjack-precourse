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

	public void setWin() {
		this.money = new Money(this.money.get());
	}

	public void setBlackjackWin() {
		this.money = new Money((int)(this.money.get() * 1.5));
	}

	public void setLose() {
		this.money = new Money(this.money.get() * (-1));
	}

	public void setDraw() {
		this.money = new Money(0);
	}

	@Override
	public String toString() {
		return name + ": " + money;
	}

	public String getCardStatus() {
		return name + " 카드: " + cards;
	}
}
