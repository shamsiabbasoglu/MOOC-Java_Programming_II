
import java.util.Scanner;

public class UserInterface {

    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Commands: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                return;
            }
            switch (command) {
                case "add":
                    System.out.print("\nTo add: ");
                    String add = scanner.nextLine();
                    todo.add(add);
                    break;
                case "remove":
                    System.out.print("\nWhich one is removed? ");
                    int number = scanner.nextInt();
                    todo.remove(number);
                    break;
                case "list":
                    todo.print();
                    break;
            }
        }
    }
}
