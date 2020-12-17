package user;

import card.Card;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static final String COMMA = ", ";

    private final List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
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
}
