package UNO;

/**
 *
 * @author Josh
 */
public class PlayCards extends Cards{
    
    private String action;
    private int draw;
    
    PlayCards(final Color c, final Value v, String action){
        super(c, v);
        this.action = action;
    }
    
    public String getAction(){
        return action;
    }
    public void setAction(String action){
        this.action = action; 
    }
    public double getDraw(){
        return draw;
    }
    public void setDraw(int draw){
        this.draw = draw;
    }
    
    public void normalCard(){
        
    }
    public void skipCard(){
        
    }
    
    public void reverseCard(){
        
    }
    
    public void wildCard(){
        
    }
    
    public void drawTwo(){
        
    }
    
    public void drawFour(){
        
    }
}
