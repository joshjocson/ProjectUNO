package UNO;

import java.util.Scanner;

/**
 *
 * @author Josh
 */
public class UNOGame extends Game{
    
//    UNOGame(boolean done){
//        super(done);
//    }
    public static void main(String[] args) {
        
        boolean done = false;
        
        Scanner scan = new Scanner(System.in);
            PlayCards play = new PlayCards();
//            System.out.println("Draw Two:");
//            play.drawTwo();
//            System.out.println("Draw Four:");
//            play.drawFour();
            System.out.println("Welcome to our UNO Card Game !");
            System.out.print("What is your name? ");
            String name = scan.next();
            System.out.println("Hello, " + name + " ! We're excited to have you play our game.");
            System.out.println("");
            
        while(!done){
          
            Deck d = new Deck();
            Hand h = new Hand();

            System.out.println("Here is your hand:");
            h.startingHand();
            //draw prompt
            Game.contPrompt();
            Cards randomCard = d.draw();
            System.out.println("Here is your new card: " + randomCard);
            System.out.println("");
            System.out.println("New Hand:");
            System.out.println(h.getCard());
            
            
            //Player.startHand() here
        System.out.println("Would you like to play again?");
        System.out.print("Press Y to play again and N to stop playing: ");
        String isDone = scan.next();
        if (isDone.equalsIgnoreCase("N")) {
            System.out.println("Thank you for playing!");
            done = true;
        } else {
            done = false;
            }
        }
    }
}