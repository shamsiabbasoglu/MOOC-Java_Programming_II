
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (amount > 0) {
                    first.add(amount);
                }
            }
            if (command.equals("remove")) {
                if (amount > 0) {
                    second.remove(amount);
                }
            }
            if (command.equals("move")) {
                if (amount > 0) {
                    if (amount <= first.getLiters()) {
                        first.remove(amount);
                        second.add(amount);
                    } else {
                        second.add(first.getLiters());
                        first.remove(first.getLiters());
                    }
                }
            }
        }
    }
}
