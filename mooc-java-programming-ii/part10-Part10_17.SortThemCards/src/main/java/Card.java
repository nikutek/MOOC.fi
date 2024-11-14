
import java.util.ArrayList;

public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if (value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int compareTo(Card compared) {
        if (this.getValue() - compared.getValue() == 0) {

            ArrayList<String> suits = new ArrayList<String>();
            suits.add("SPADE");
            suits.add("HEART");
            suits.add("DIAMOND");
            suits.add("CLUB");
            int score = suits.indexOf(this.getSuit().toString());
            int comparedScore = suits.indexOf(compared.getSuit().toString());
            return comparedScore - score ;
        }
        return this.getValue() - compared.getValue();
    }
}
