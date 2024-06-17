
import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> items;
    private int capacity;

    public OneItemBox() {
        this.items = new ArrayList<>();
        this.capacity = 1;
    }

    @Override
    public void add(Item item) {
        if (items.size() < capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
