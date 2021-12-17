package mytest;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import domain.Card;
import domain.Player;
import domain.repository.CardNum;
import domain.repository.CardPattern;

public class UnitTest {
	private static final String ERROR_MESSAGE = "[ERROR]";

	@Test
	void AceTest() {
		Player player = new Player("jiwoo");
		player.cards.cardAppend(new Card(CardNum.NINE, CardPattern.CLOVER));
		player.cards.cardAppend(new Card(CardNum.ACE, CardPattern.CLOVER));
		player.cards.cardAppend(new Card(CardNum.ACE, CardPattern.CLOVER));

		System.out.println(player.getCardStatus());
		System.out.println(player.cards.getCardSum());

		assertThat(player.cards.getCardSum()).isEqualTo(11);
	}

	@Test
	void AceTest2() {
		Player player = new Player("jiwoo");
		player.cards.cardAppend(new Card(CardNum.EIGHT, CardPattern.CLOVER));
		player.cards.cardAppend(new Card(CardNum.ACE, CardPattern.CLOVER));
		player.cards.cardAppend(new Card(CardNum.ACE, CardPattern.CLOVER));

		System.out.println(player.getCardStatus());
		System.out.println(player.cards.getCardSum());

		assertThat(player.cards.getCardSum()).isEqualTo(20);
	}
}
