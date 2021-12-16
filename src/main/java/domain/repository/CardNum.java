package domain.repository;

import utils.Converter;

public enum CardNum {
	ACE(1, "A"),
	TWO(2, "2"),
	THREE(3, "3"),
	FOUR(4, "4"),
	FIVE(5, "5"),
	SIX(6, "6"),
	SEVEN(7, "7"),
	EIGHT(8, "8"),
	NINE(9, "9"),
	TEN(10, "10"),
	JACK(10, "J"),
	QUEEN(10, "Q"),
	KING(10, "K");

	private final int number;
	private final String value;

	CardNum(final int number, final String value) {
		this.number = number;
		this.value = value;
	}

	// 추가 기능 구현
	public int getNumber() {
		return number;
	}

	public boolean equals(String value) {
		return this.value.equals(value);
	}

	@Override
	public String toString() {
		return value;
	}
}
