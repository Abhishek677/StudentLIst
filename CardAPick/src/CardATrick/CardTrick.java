
package CardATrick;

import CardATrick.Card.Suit;
import CardATrick.Card.Value;
import java.util.*;
/**
 * Name: Abhishek Jassal
 * Student ID:991605946
 * @author Abhishek
 */
public class CardTrick {
   
    public static void main(String[] args)
    {     
        //This is scanner class to take user input
         Scanner input = new Scanner(System.in);
         
         //this is random class to generate random number
        
        Card[] magicHand = new Card[7];
        
        Suit[] cardSuits = Suit.values();
        Value[] cardValues = Value.values();
        
        // We'll use Random to generate random numbers
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Suit suit = cardSuits[random.nextInt(cardSuits.length)];
            Value value = cardValues[random.nextInt(cardValues.length)];
            
            Card c = new Card(suit,value);
            magicHand[i] = c;
            
        }
        
        // print them out for debugging purposes
        System.out.println("Here are the cards in the hand");
        for (Card c : magicHand)
        {
            System.out.printf("%s of %s\n", c.getValue(), c.getSuit());
        }
        
        
        // Now ask the user for a card
        System.out.println("\n"+"Pick a suit for your card");
        for (int i = 0; i < cardSuits.length; i++)
        {
            System.out.println((i + 1) + ": " + cardSuits[i]);
        }
            
            
        System.out.print("\n"+"Enter a suit number for your card you want to Pick: ");
        int suitPosition = input.nextInt() - 1;

        
        for (int i = 0; i < cardValues.length; i++)
        {
            System.out.println((i + 1) + ": " + cardValues[i]);
        }
        
        System.out.print("Enter a value (1 to 13): ");
        int valuePosition = input.nextInt() -1;
        
        
        Card userGuess = new Card(cardSuits[suitPosition],cardValues[valuePosition]);

        boolean match = false;
        for (Card c : magicHand)
        {
            if (c.getValue() == userGuess.getValue()&& c.getSuit()==(userGuess.getSuit()))
            {
                match = true;
                break;
            }
        }
    
        String response = match ? "Card in Magic Hand": "No match";
        
        System.out.println(response);
        
         
    }
}
