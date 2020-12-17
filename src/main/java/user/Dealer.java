package user;

import card.Card;

/**
 * 게임 딜러를 의미하는 객체
 */
public class Dealer extends User{
    private static final int FIRST_CARD_INDEX = 0;
    public Dealer() {}

    public String getFirstCard() {
        Card firstCard = getCards().get(FIRST_CARD_INDEX);
        return firstCard.getInformation();
    }
}
