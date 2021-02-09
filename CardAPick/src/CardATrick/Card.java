
package CardATrick;

/**
 * Name: Abhishek Jassal
 * Student ID:
 * @author Abhishek 
 */
public class Card {

   private String suit;
   private int value;
   
   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   public static final String [] VALUES = {"Ace", "two", "three","four","five","six","seven","eight","nine", "ten","Jack","Queen","King"};

    /**
     * This is getter method for suit
     * @return String
     */
   
    
   
    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }
    
    /**
     * This setter method for suit
     * @param suit 
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    /**
     * This is getter method value
     * @return int
     */
    public int getValue() {
        return value;
    }
    
    /**
     * This is setter method for value
     * @param value 
     */
    public void setValue(int value) {
        this.value = value;
    }
    
   
}
