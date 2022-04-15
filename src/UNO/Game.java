package UNO;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Josh
 */
public abstract class Game {
    
    private boolean done;
    private String name;
    private ArrayList <Player> players;
    
    Game(){
        
    }
    Game(String name){
        this.name = name;
        this.players = new ArrayList();
    }
    
    public ArrayList getPlayers(){
        return players;
    }
    
    public void setPlayer(ArrayList players){
        this.players = players;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    
    public abstract void winner();
}
