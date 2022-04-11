package UNO;

/**
 *
 * @author Josh
 */
public class Hand {
    
    private Cards[] card;
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
        Cards[] reference = this.getCard();
        this.setCard(new Cards[this.getCard().length + 1]);
        
        //Copy all existing/reference cards into cards
        for(int i = 0; i < reference.length; i++){
            this.getCard()[i] = reference[i];
        }
        this.getCard() [reference.length] = card;
        System.out.println(card);
    }
    
    public void currentHand(){
        
    }

    /**
     * @return the card
     */
    public Cards[] getCard() {
        return card;
    }

    /**
     * @param card the card to set
     */
    public void setCard(Cards[] card) {
        this.card = card;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
}
