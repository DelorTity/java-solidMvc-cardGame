package modele;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<PlayingCard> cards;

    public Hand() {
        cards = new ArrayList<PlayingCard>();
    }

    public void addCards(PlayingCard pc) {
        cards.add(pc);
    }

    public PlayingCard getCards(int index) {
        return cards.get(index);
    }

    public PlayingCard removeCards(int index) {
        return cards.remove(0);
    }
}
