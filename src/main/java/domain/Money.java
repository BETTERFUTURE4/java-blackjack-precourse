package domain;

import utils.validator.MoneyValidator;

public class Money {
	private int money;

	public Money(String money) {
		new MoneyValidator(money);
		// 컨버터 이용해 값 적절하게 변경
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
