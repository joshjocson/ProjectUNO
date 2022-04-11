package UNO;

/**
 *
 * @author Josh
 */
public class Hand {
    
    public Cards[] card;
    private int count;
    
    Hand(){
        card = new Cards[0];
    }
    
    public void startingHand(){
        Deck d = new Deck();
        for(int i = 0; i < 7; i++){
            addCards(d.draw());
        }
    }
    public void addCards(Cards card){
        Cards[] reference = this.card;
        this.card = new Cards [this.card.length + 1];
        
        //Copy all existing/reference cards into cards
        for(int i = 0; i < reference.length; i++){
            this.card[i] = reference[i];
        }
        this.card [reference.length] = card;
        System.out.println(card);
    }
    
    public void currentHand(){
        
    }
}
