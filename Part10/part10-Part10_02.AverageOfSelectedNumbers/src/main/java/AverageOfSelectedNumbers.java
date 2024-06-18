
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(input);
        }
        System.out.println("Print the average of the negative "
                + "numbers or the positive numbers? (n/p)");
        String answer = scanner.nextLine();
        if (answer.equals("n")) {
            double averageNegative = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(f -> f < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + averageNegative);
        } else {
            double averagePositive = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(f -> f > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + averagePositive);
        }
    }
}
