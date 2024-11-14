
public class Main {

    public static void main(String[] args) {
        Hand hand1 = new Hand();
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(14, Suit.DIAMOND));
        Hand hand2 = new Hand();
        hand2.add(new Card(3, Suit.HEART));
        hand2.compareTo(hand1);
    }
}
