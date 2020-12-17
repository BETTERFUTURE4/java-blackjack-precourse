package user;

import card.Card;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static final int BLACK_JACK = 21;
    private static final String COMMA = ", ";

    private final List<Card> cards = new ArrayList<>();
    private int score = 0;

    public void addCard(Card card) {
        cards.add(card);
        score += card.score();
    }

    public List<Card> getCards() {
        return cards;
    }

    public String getAllCard() {
        List<String> allCardInformation = new ArrayList<>();
        for (Card card : cards) {
            allCardInformation.add(card.getInformation());
        }
        return String.join(COMMA, allCardInformation);
    }

    public int getScore() {
        return score;
    }
}
