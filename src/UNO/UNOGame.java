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
        
        Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to our UNO Card Game !");
            System.out.print("What is your name? ");
            String name = scan.next();
            System.out.println("Hello, " + name + " ! We're excited to have you play our game.");
            System.out.println("");

            Deck d = new Deck();
            Hand h = new Hand();

            System.out.println("Here is your hand:");
            h.startingHand();
            //draw prompt
            Game.contPrompt();
            Cards randomCard = d.draw();
            System.out.println("Here is your new card: " + randomCard);
            
            

            //Player.startHand() here
    }
}