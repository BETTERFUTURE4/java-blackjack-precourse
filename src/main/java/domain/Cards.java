package domain;

import java.util.ArrayList;

import utils.Converter;
import utils.validator.NamesValidator;

public class Cards {
	private ArrayList<Card> cards = new ArrayList<>();

	public void cardAppend(Card card) {
		cards.add(card);
	}
	public ArrayList<Card> get() {
		return cards;
	}

	public boolean isEmpty() {
		return cards.isEmpty();
	}

	@Override
	public String toString() {
		// 프린트 원하는 방식으로 구현
		return cards.toString();
	}
}
