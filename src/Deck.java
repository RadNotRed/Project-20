import java.util.ArrayList;
import java.util.Collections;

// Define a class named Deck
public class Deck {
    // Declare a private final ArrayList of Cards named cards
    private final ArrayList<Card> cards;

    // Define a constructor for the Deck class
    public Deck() {
        // Initialize the cards ArrayList
        cards = new ArrayList<Card>();
        // Define an array of Strings representing the four suits of playing cards
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        // Create 13 cards for each suit and add them to the cards ArrayList
        for (String suit : suits) {
            for (int i = 1; i <= 13; i++) {
                cards.add(new Card(suit, i));
            }
        }
    }

    // Define a method to shuffle the cards in the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Define a method to draw a card from the deck
    public Card drawCard() {
        // Check if the deck is not empty
        if (cards.size() > 0) {
            // Remove and return the first card from the deck
            return cards.remove(0);
        } else {
            // Return null if the deck is empty
            return null;
        }
    }
}
