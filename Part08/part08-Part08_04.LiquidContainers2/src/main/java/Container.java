
public class Container {

    private int liters;

    public Container() {
        this.liters = 0;
    }

    public int contains() {
        return liters;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (liters + amount > 100) {
                liters = 100;
            } else {
                liters += amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (amount > liters) {
                liters = 0;
            } else {
                liters -= amount;
            }
        }
    }

    @Override
    public String toString() {
        return liters + "/100";
    }
}
