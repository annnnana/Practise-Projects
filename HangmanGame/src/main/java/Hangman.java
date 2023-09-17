import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hangman {
    private String wordToGuess;
    private StringBuilder guessedWord;
    private int attemptsRemaining;
    private Set<Character> guessedLetters;

    public Hangman() {
    }

    public void initialize() {
        guessedLetters = new HashSet<>();
        WordList words = new WordList();
        wordToGuess = words.getRandomWord();
        guessedWord = new StringBuilder("_".repeat(wordToGuess.length()));
        attemptsRemaining = 7;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        while (attemptsRemaining > 0 && !gameWon) {
            System.out.println("Word to Guess: " + guessedWord.toString());
            System.out.println("Attempts Remaining: " + attemptsRemaining);
            System.out.print("Guess a letter: ");
            String guess = scanner.next().toLowerCase();

            if (guess.length() != 1) {
                System.out.println("Please enter only one letter.");
                continue;
            }

            char letter = guess.charAt(0);
            if (guessedLetters.contains(letter)) {
                System.out.println("You've already guessed the letter '" + letter + "'. Try a different one.");
                continue;
            }
            guessedLetters.add(letter);

            boolean correctGuess = false;

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == letter && guessedWord.charAt(i) == '_') {
                    guessedWord.setCharAt(i, letter);
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                attemptsRemaining--;
            }

            if (guessedWord.toString().equals(wordToGuess)) {
                gameWon = true;
                System.out.println("Good job! You guessed the word: " + wordToGuess);
            }
        }

        if (!gameWon) {
            System.out.println("Game Over. The word was: " + wordToGuess);
        }
    }

    public boolean playAgain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play again? (1 - Yes / 2 - No)");
        int choice = scanner.nextInt();

        switch (choice){
            case 1 :
                return true;
            case 2 :
                return false;
            default:
                System.out.println("Invalid choice. Please enter '1' or '2'.");
                return playAgain();
        }

    }
}
