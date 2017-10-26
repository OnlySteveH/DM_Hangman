public class Hangman {

    public static void main(String[] args) {
        // Your incredible code goes here...
        Game game = new Game("treehouse");
        Prompter prompter = new Prompter(game);
        while (game.getRemainingTries() > 0) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }
    }
}