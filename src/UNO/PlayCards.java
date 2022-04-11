package UNO;

/**
 *
 * @author Josh
 */
public class PlayCards{
    
    private String action;
    private int draw;
    
//    PlayCards(final Color c, final Value v, String action){
//        super(c, v);
//        this.action = action;
//    }
    
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
        Cards.Color.values();
    }
    
    public void drawTwo(){
        Hand draw = new Hand();
        Deck d = new Deck();
        for(int i = 0; i < 2; i++){
            draw.addCards(d.draw());
        }
    }
    
    public void drawFour(){
        for(int i = 0; i < 2; i++){
            drawTwo();
        }
    }
}
