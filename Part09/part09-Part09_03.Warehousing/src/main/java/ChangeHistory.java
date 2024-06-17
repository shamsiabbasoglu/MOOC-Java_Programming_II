
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> states;

    public ChangeHistory() {
        this.states = new ArrayList<>();
    }

    public void add(double status) {
        states.add(status);
    }

    public void clear() {
        states.clear();
    }

    @Override
    public String toString() {
        return states.toString();
    }

    public double maxValue() {
        if (states.isEmpty()) {
            return 0;
        }
        double a = states.get(0);
        for (Double d : states) {
            a = Math.max(a, d);
        }
        return a;
    }

    public double minValue() {
        if (states.isEmpty()) {
            return 0;
        }
        double a = states.get(0);
        for (Double d : states) {
            a = Math.min(a, d);
        }
        return a;
    }

    public double average() {
        if (states.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Double d : states) {
            sum += d;
        }
        return sum / states.size();
    }
}
