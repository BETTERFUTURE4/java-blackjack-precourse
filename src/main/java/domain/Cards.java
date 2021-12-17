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
		int sum = cards.stream().mapToInt(Card::getNumber).sum();
		if (isInAce() && isGoodToChangeAce(sum)) {
			sum += 10;
		}
		return sum;
	}

	public boolean isInAce() {
		return cards.stream()
			.map(card -> card.number)
			.anyMatch(cardNum -> cardNum.equals("A"));
	}

	public boolean isGoodToChangeAce(int sum) {
		return sum < 11;
	}

	public boolean isTwoCard() {
		return cards.size() == 2;
	}

	@Override
	public String toString() {
		return cards.toString()
			.substring(1, cards.toString().length()-1);
	}
}
