
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TodoList {

    private List<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        IntStream.range(0, tasks.size())
                .forEach(i -> System.out.println((i + 1) + ": " + tasks.get(i)));
    }

    public void remove(int number) {
        tasks.removeIf(task -> tasks.indexOf(task) == number - 1);
    }
}
