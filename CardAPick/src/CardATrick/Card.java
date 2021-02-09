package CardATrick;

/**
 * Name: Abhishek Jassal Student ID:991605946
 *
 * @author Abhishek
 */
public class Card {

    public enum Suit {HEARTS, CLUBS, SPADES, DIAMONDS};

    public enum Value {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value)
    {
        this.suit = suit;
        this.value = value;
    }

    /**
     * This is getter method for suit
     *
     * @return String
     */
    public Suit getSuit()
    {
        return this.suit;
    }

    /**
     * This setter method for suit
     *
     * @param suit
     */
    public void setSuit(Suit suit)
    {
        this.suit = suit;
    }

    /**
     * This is getter method value
     *
     * @return int
     */
    public Value getValue()
    {
        return this.value;
    }

    /**
     * This is setter method for value
     *
     * @param value
     */
    public void setValue(Value value)
    {
        this.value = value;
    }

}
