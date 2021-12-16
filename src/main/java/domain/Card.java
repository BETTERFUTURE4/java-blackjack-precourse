package domain;

import domain.repository.CardNum;
import domain.repository.CardPattern;
import utils.Util;

public class Card {
	public final CardNum number;
	public final CardPattern pattern;

	public Card(CardNum number, CardPattern pattern) {
		this.number = number;
		this.pattern = pattern;
	}

	public Card() {
		this.number = Util.getRandomCardNum();
		this.pattern = Util.getRandomCardPattern();
	}

	public boolean equals(Card obj) {
		// 모델값 같은지 확인
		return number.equals(obj.number) && pattern.equals(obj.pattern);
	}

	@Override
	public String toString() {
		return number.toString() + pattern;
	}
}
