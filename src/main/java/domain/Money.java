package domain;

import utils.Converter;
import utils.validator.MoneyValidator;

public class Money {
	private final int money;

	public Money(int money) {
		this.money = money;
	}

	public Money(String moneyString) {
		new MoneyValidator(moneyString);
		this.money = Converter.getInt(moneyString);
	}

	public int get() {
		return money;
	}

	@Override
	public String toString() {
		return Integer.toString(money);
	}
}
