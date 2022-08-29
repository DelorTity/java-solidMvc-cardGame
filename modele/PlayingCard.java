package modele;

public class PlayingCard {
    private Rank rank;
    private Suit suit;
    boolean faceUp;

    public PlayingCard(Rank rank, Suit suit) {
        super();
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public boolean flip() {
        faceUp = !faceUp;
        return faceUp;
    }
}