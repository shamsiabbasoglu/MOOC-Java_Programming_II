
import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

    private final List<T> pipes;

    public Pipe() {
        this.pipes = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        pipes.add(value);
    }

    public T takeFromPipe() {
        if (pipes.isEmpty()) {
            return null;
        }
        T value = pipes.get(0);
        pipes.remove(0);
        return value;
    }
    
    public boolean isInPipe() {
        return !pipes.isEmpty();
    }
}
