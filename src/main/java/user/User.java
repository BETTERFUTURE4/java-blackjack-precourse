package user;

import card.Card;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private static final int BLACK_JACK = 21;
    private static final int ACE_CARD_REMAIN_SCORE = 10;
    private static final String COMMA = ", ";

    private final List<Card> cards = new ArrayList<>();
    private int score = 0;

    public void addCard(Card card) {
        cards.add(card);
        score += card.score();
    }

    public abstract boolean canDraw();

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

    public int getFinalScore() {
        for (Card card : cards) {
            checkAce(card);
        }
        return getScore();
    }

    private void checkAce(Card card) {
        if (card.isAce()) {
            if (score + ACE_CARD_REMAIN_SCORE <= BLACK_JACK) {
                score += ACE_CARD_REMAIN_SCORE;
            }
        }
    }
}
