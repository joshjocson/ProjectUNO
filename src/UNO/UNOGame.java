package UNO;

import java.util.Scanner;

/**
 *
 * @author Josh
 */
public class UNOGame{
    
    public static void main(String[] args) {
        
        boolean done = false;
        boolean leave = false;
        Deck d = new Deck();
        Player p1 = new Player();
        Player p2 = new Player();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our UNO Card Game !");
            System.out.print("What is your name? ");
            String name = sc.next();
            System.out.println("");
            System.out.println("Hello, " + name + "! We're excited to have you play our game.");
            System.out.println("-----------------------------------------------------");
        
        boolean newRound = true; 
        Cards topcard = new Cards();
        int wins = 0;
        int rounds = 1;
        while(!done){
            if(newRound == true){
                d = new Deck();
                System.out.println("Round: " + rounds++);
                System.out.println("Your Score: " + wins);
                System.out.println("-----------------------");
                System.out.println("GAME BEGINS:");
                System.out.println("");
                p1.generateHand(d);
                p2.generateHand(d);
                topcard = d.draw();                
                newRound = false;
            }
            System.out.println("PLAYER 1's TURN:");
//            p1.seeHand();
            System.out.println("");
            //The Top Card is the card players have to match
            System.out.println("Top Card: " + topcard);
            System.out.println("-----------------------");
            System.out.println("Player 1's Hand: ");
            topcard = p1.setCard(topcard, false, d, 0);
            System.out.println("");
            System.out.println("Player 1 sets: " + topcard);
            
            if(p1.getHand().isEmpty()){
                leave = true;
            }
 
            if(leave == false && topcard != null){
                System.out.println("");
                System.out.println("Top Card: " + topcard);
                System.out.println("-----------------------");
                p2.checkCard(topcard, d);
                System.out.println("PLAYER 2's TURN:");
                topcard = p2.setCard(topcard, true, d, 0);
                System.out.println("Player 2 sets: " + topcard);
                System.out.println("");
                p1.checkCard(topcard, d);
            }
            
            if(d.deck.isEmpty() || p1.getHand().isEmpty() || p2.getHand().isEmpty() || topcard == null){
                if(p1.getHand().isEmpty()){
                    System.out.println("Congratulations, you win!");
                    wins++;
                }else if(p1.getHand().size() > p2.getHand().size()){
                    System.out.println("Congratulations, you win!");
                    wins++;
                }else{
                    System.out.println("Unfortunately, you've lost :(");
                }
                System.out.println("Would you like to play again?");
                System.out.print("Press Y to play again and N to stop playing: ");
                String isDone = sc.next();
                if(isDone.equalsIgnoreCase("N")) {
                    System.out.println("Thank you for playing!");
                    done = true;
                }else {
                    done = false;
                    newRound = true;
                }
            }
        }
    }
}