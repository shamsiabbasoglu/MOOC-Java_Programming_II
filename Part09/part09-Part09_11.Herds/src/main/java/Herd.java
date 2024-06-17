
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    @Override
    public String toString() {
        String print = "";
        for (Movable organism : herd) {
            print = print + organism + "\n";
        }
        return print;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : herd) {
            organism.move(dx, dy);
        }
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
} 
