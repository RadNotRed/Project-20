public record Card(String suit, int value) {

    // Override the toString() method to return a string representation of the card
    public String toString() {
        String name = "";
        // Use a switch statement to determine the name of the card
        switch (value) {
            case 1 -> name += "Ace";
            case 11 -> name += "Jack";
            case 12 -> name += "Queen";
            case 13 -> name += "King";
            default -> name += value;
        }
        // Add the suit of the card to the name
        name += " of " + suit;
        return name;
    }
}
