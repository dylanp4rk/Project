
import java.util.Scanner;

/**

 * @author Dylan Park
 */
public class CardGame {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a cards suit and it's value to try and match "
                + "with the computers randomized card if it is a match you "
                + "win you have a 1 out of 52 chance good luck ");
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