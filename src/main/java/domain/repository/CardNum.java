package domain.repository;

import utils.Converter;

public enum CardNum {
	ACE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(10),
	QUEEN(10),
	KING(10);

	private final int number;

	CardNum(final int Pattern) {
		this.number = Pattern;
	}

	// 추가 기능 구현
	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return Converter.getString(number);
	}
}
