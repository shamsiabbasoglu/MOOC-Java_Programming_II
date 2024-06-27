
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private final List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.forEach(p -> System.out.println(p));
    }

    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand o) {
        int sum1 = this.cards.stream()
                .mapToInt(Card::getValue)
                .sum();
        int sum2 = o.getCards().stream()
                .mapToInt(Card::getValue)
                .sum();
        return sum1 - sum2;
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
