public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Hangman! Try to guess the word.");
        Hangman game = new Hangman();
        boolean newGame = true;

        while(newGame) {
            game.initialize();
            game.play();
            newGame = game.playAgain();
        }
    }
}
