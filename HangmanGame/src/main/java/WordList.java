import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class WordList {
    private List<String> words;

    public WordList() {
        words = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("dictionary.txt"));
            while (scanner.hasNextLine()) {
                words.add(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error reading dictionary file: " + e.getMessage());
        }
    }

    public String getRandomWord() {
        if (words.isEmpty()) {
            System.out.println("Dictionary is empty.");
            return null;
        }
        Random rand = new Random();
        return words.get(rand.nextInt(words.size()));
    }
}