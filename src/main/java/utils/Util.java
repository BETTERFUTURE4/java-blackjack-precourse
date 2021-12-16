package utils;

import java.util.Random;

import domain.repository.CardNum;
import domain.repository.CardPattern;

public class Util {
	public static CardNum getRandomCardNum() {
		CardNum[] array = CardNum.values();
		int randomIndex = new Random().nextInt(array.length);
		return array[randomIndex];
	}

	public static CardPattern getRandomCardPattern() {
		CardPattern[] array = CardPattern.values();
		int randomIndex = new Random().nextInt(array.length);
		return array[randomIndex];
	}
}
