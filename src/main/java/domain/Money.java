package domain;

import utils.Converter;
import utils.validator.MoneyValidator;

public class Money {
	private int money;

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

	public boolean isEmpty() {
		return money == 0;
	}

	public boolean equals(Money obj) {
		// 모델값 같은지 확인
		return this.money == obj.get();
	}

	@Override
	public String toString() {
		return Integer.toString(money);
	}
}
