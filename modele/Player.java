package modele;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        super();
        this.name = name;
        this.hand = new Hand();
    }

    public void addCardToHand(PlayingCard pc) {
        hand.addCards(pc);
    }

    public PlayingCard getCard(int index) {
        return hand.getCards(index);
    }

    public PlayingCard removeCard(int index) {
        return hand.removeCards(0);
    }

    public String getName() {
        return name;
    }
}
