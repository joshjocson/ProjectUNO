package UNO;

import java.util.Scanner;

/**
 *
 * @author Josh
 */
public abstract class Game {
    
    private boolean done;
    
    
    public static boolean contPrompt(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to draw?");
        System.out.print("Press D to draw and N to not draw: ");
        String isDone = keyboard.next();
        boolean done;
        if (isDone.equalsIgnoreCase("N")) {
            System.out.println("No, seriously, please draw a card");
            done = true;
        } else {
            done = false;
        }
        return done;
    }

    /**
     * @return the done
     */
    public boolean isDone() {
        return done;
    }

    /**
     * @param done the done to set
     */
    public void setDone(boolean done) {
        this.done = done;
    }
}
