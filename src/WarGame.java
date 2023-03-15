import java.util.ArrayList;

public class WarGame {
    // Define the main method of the program
    public static void main(String[] args) {

        // Create a new deck of playing cards
        Deck deck = new Deck();

        // Shuffle the deck to randomize the order of cards
        deck.shuffle();

        // Create two ArrayLists to store cards for the player and computer
        ArrayList<Card> playerCards = new ArrayList<Card>();
        ArrayList<Card> computerCards = new ArrayList<Card>();

        // Draw 26 cards from the deck and add them to the respective ArrayLists
        for (int i = 0; i < 26; i++) {
            playerCards.add(deck.drawCard());
            computerCards.add(deck.drawCard());
        }

        // Initialize two variables to keep track of the scores for each player
        int playerScore = 0;
        int computerScore = 0;

        // Play 26 rounds of the game
        for (int i = 0; i < 26; i++) {

            // Print the cards played by the player and computer
            System.out.println("Player plays: " + playerCards.get(i));
            System.out.println("Computer plays: " + computerCards.get(i));

            // Compare the values of the cards played and determine the winner of the round
            if (playerCards.get(i).value() > computerCards.get(i).value()) {
                System.out.println("Player wins the round!\n");
                playerScore++;
            } else if (playerCards.get(i).value() < computerCards.get(i).value()) {
                System.out.println("Computer wins the round!\n");
                computerScore++;
            } else {
                System.out.println("It's a tie!");
                break; // End the game after a tie
            }
        }

        // Print the final scores for both players
        System.out.println("\nFinal score:");
        System.out.println("Player: " + playerScore);
        System.out.println("Computer: " + computerScore);

        // Determine the winner of the game based on the final scores
        if (playerScore > computerScore) {
            System.out.println("Player wins the game!");
        } else if (playerScore < computerScore) {
            System.out.println("Computer wins the game!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
