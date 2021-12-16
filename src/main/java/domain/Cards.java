package domain;

import java.util.ArrayList;

import utils.Converter;
import utils.validator.NamesValidator;

public class Cards {
	private final ArrayList<Card> cards = new ArrayList<>();

	public void cardAppend(Card card) {
		cards.add(card);
	}

	public int getCardSum() {
		int sum = 0;
		for (Card card : cards) {
			sum += card.getNumber();
		}

		if (isInAce() && isGoodToChangeAce(sum)) {
			sum += 10;
		}
		return sum;
	}

	public boolean isInAce() {
		for (Card card : cards) {
			if (card.number.equals("A")) {
				return true;
			}
		}
		return false;
	}

	public boolean isGoodToChangeAce(int sum) {
		return sum < 11;
	}

	public boolean isTwoCard() {
		return cards.size() == 2;
	}

	@Override
	public String toString() {
		// 프린트 원하는 방식으로 구현
		return cards.toString().substring(1,cards.toString().length()-1);
	}
}
