
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Dylan Park
 */
public class CardGame {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[1];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
         
             System.out.println("Enter a card suit");
             Card.playersuit = input.nextLine();
             System.out.println("Enter a card value");
             Card.playervalue = input.nextInt();
             if(Card.playersuit == c.getSuit() & Card.playervalue == c.getValue()){
                 System.out.println("Match: your card was: " + Card.playersuit + " " + Card.playervalue + " Computer's card was: " + c.getSuit() + " " + c.getValue());
             }
             else{
                 System.out.println("No match your card was: " + Card.playersuit + " " + Card.playervalue + " Computer's card was: " + c.getSuit() + " " + c.getValue());
             } 
                
         
        }
      
     
    }
    
}