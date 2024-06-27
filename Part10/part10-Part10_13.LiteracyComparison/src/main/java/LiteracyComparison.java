
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<CountryData> listOfPeople = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("literacy.csv"))) {
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] inputtedLine = input.split(",");
                String[] gender = inputtedLine[2].trim().split(" ");
                String country = inputtedLine[3];
                int year = Integer.valueOf(inputtedLine[4]);
                String rate = inputtedLine[5];
                listOfPeople.add(new CountryData(gender[0], country, year, rate));
            }
        } catch (IOException e) {
            e.getMessage();
        }
        Collections.sort(listOfPeople, (p1, p2) -> p1.getRate().compareTo(p2.getRate()));
        listOfPeople.stream()
                .forEach(p -> System.out.println(p));
    }
}
