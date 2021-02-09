
package CardATrick;
import java.util.*;
/**
 *
 * @author Abhishek
 */
public class CardTrick {
   
    public static void main(String[] args)
    {     
        //This is scanner class to take user input
         Scanner input = new Scanner(System.in);
         
         //this is random class to generate random number
        Random random = new Random();
        
        Card[] magicHand = new Card[7];
        
                for (int i=0; i<magicHand.length; i++)
        {
            int value = random.nextInt(13)+1;     // this genrates number between 1 to 13
  
            String suit=Card.SUITS[random.nextInt(4)]; // this generates number between 0 to 3
            
            Card c = new Card(suit,value);
            
            magicHand[i]=c;
        }
        System.out.println("Here are the cards in the hand");
        for (Card c : magicHand) {
            System.out.printf("%d of %s\n", c.getValue(), c.getSuit());
        }
        
        System.out.println("\n"+"Pick a suit for your card");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }
        
        
        System.out.print("\n"+"Enter a suit number for your card you want to Pick: ");
        int suit = input.nextInt();
        
        for (int i = 0; i < Card.VALUES.length; i++) {
            System.out.println((i + 1) + ": " + Card.VALUES[i]);
        }
        
        System.out.print("Enter a value (1 to 13): ");
        int value = input.nextInt();
        
        Card userGuess = new Card(Card.SUITS[suit - 1],value);

        boolean match = false;
        for (Card c : magicHand) {
            if (c.getValue() == userGuess.getValue()
                    && c.getSuit().equals(userGuess.getSuit())) {
                match = true;
                break;
            }
        }
    
        String response = match ? "Card in Magic Hand": "No match";
        
        System.out.println(response);
        
         
    }
}
