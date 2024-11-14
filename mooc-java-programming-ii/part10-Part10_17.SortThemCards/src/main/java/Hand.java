
import java.util.ArrayList;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards = new ArrayList<>();

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    public void sort() {
        cards = cards.stream()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int compareTo(Hand compared) {
        int handScore = 0;
        int comparedHandScore = 0;
        for (Card card : cards) {
            handScore += card.getValue();
        }
        for (Card card : compared.getCards()) {
            comparedHandScore += card.getValue();
        }
        System.out.println(handScore);
        System.out.println(comparedHandScore);
        
        return  handScore - comparedHandScore;
    }
}
