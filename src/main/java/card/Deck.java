package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck(List<Card> cards) {
        this.cards.addAll(cards);
    }

    public void shuffle() {
         Collections.shuffle(cards);
    }
}
