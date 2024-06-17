
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> packables;
    private double capacity;

    public Box(double capacity) {
        this.capacity = capacity;
        this.packables = new ArrayList<>();
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable p : packables) {
            totalWeight += p.weight();
        }
        return totalWeight;
    }

    public void add(Packable packable) {
        if (weight() + packable.weight() <= capacity) {
            packables.add(packable);
        }
    }

    @Override
    public String toString() {
        return "Box: " + packables.size() + " items, total weight " + weight() + " kg";
    }
}
