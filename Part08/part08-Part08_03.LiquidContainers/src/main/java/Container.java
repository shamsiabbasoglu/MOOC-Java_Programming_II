public class Container {
    private int liters;

    public Container() {
        liters = 0;
    }

    public int getLiters() {
        return liters;
    }
    
    public void add(int amount) {
        if (liters + amount < 100) {
            liters += amount;
        } else {
            liters = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount > liters) {
            liters = 0;
        } else {
            liters -= amount;
        }
    }

    @Override
    public String toString() {
        return liters + "/100";
    }
}
