package dictionary;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private final Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean save() {
        try (PrintWriter printer = new PrintWriter(file)) {
            while (!dictionary.isEmpty()) {
                String english = dictionary.entrySet().stream()
                        .map(map -> map.getValue())
                        .findFirst()
                        .orElse(null);
                String finnish = dictionary.entrySet().stream()
                        .map(map -> map.getKey())
                        .findFirst()
                        .orElse(null);
                dictionary.remove(finnish, english);
                printer.println(finnish + ":" + english);
            }
            printer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else if (dictionary.containsValue(word)) {
            return dictionary.entrySet().stream()
                    .filter(map -> word.equals(map.getValue()))
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(null);
        } else {
            return null;
        }
    }

    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        } else if (dictionary.containsValue(word)) {
            dictionary.entrySet().removeIf(map -> map.getValue().equals(word));
        }
    }
}
