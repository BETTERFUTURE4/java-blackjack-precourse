package card;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Deck {
    private Stack<Card> cards = new Stack<>();

    public Deck(List<Card> cards) {
        this.cards.addAll(cards);
    }

    public void shuffle() {
         Collections.shuffle(cards);
    }
}
