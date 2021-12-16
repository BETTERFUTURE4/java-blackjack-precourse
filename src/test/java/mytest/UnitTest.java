package mytest;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import domain.Card;
import domain.User;
import domain.repository.CardNum;
import domain.repository.CardPattern;

public class UnitTest {
	private static final String ERROR_MESSAGE = "[ERROR]";

	@Test
	void AceTest() {
		User user = new User("jiwoo");
		user.cards.cardAppend(new Card(CardNum.NINE, CardPattern.CLOVER));
		user.cards.cardAppend(new Card(CardNum.ACE, CardPattern.CLOVER));
		user.cards.cardAppend(new Card(CardNum.ACE, CardPattern.CLOVER));

		System.out.println(user.getCardStatus());
		System.out.println(user.cards.getCardSum());

		assertThat(user.cards.getCardSum()).isEqualTo(11);
	}

	@Test
	void AceTest2() {
		User user = new User("jiwoo");
		user.cards.cardAppend(new Card(CardNum.EIGHT, CardPattern.CLOVER));
		user.cards.cardAppend(new Card(CardNum.ACE, CardPattern.CLOVER));
		user.cards.cardAppend(new Card(CardNum.ACE, CardPattern.CLOVER));

		System.out.println(user.getCardStatus());
		System.out.println(user.cards.getCardSum());

		assertThat(user.cards.getCardSum()).isEqualTo(20);
	}
}
