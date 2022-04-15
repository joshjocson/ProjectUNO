package UNO;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Josh
 */
public class Player {
    private ArrayList<Cards> hand = new ArrayList<Cards>();
    
    Player(){
    
    }
    
    public ArrayList getHand(){
        return hand;
    }
    
    public void seeHand(){
        for(int i = 0; i < hand.size(); i++){
            System.out.println((i + 1) + ": " + hand.get(i));
        }
    }
    
    public void generateHand(Deck deck){
        hand.clear();
        for(int i = 0; i < 7; i++){
            hand.add(deck.draw());
        }
    }
    
    public boolean drawCard(Deck deck){
        if(deck.deck.isEmpty()){
            return false;
        }else{
            hand.add(deck.draw());
        }
        return true;
    }
    
    public Cards setCard(Cards topcard, boolean ai, Deck deck, int ctr){
        ctr = ctr + 1;
        int num = 0;
        int handSize = hand.size();
        int newHandSize = 0;
        boolean validDraw = true;
        Cards card = new Cards();
        if(ai == false){
            boolean validCard = false;
            for(int i = 0; i < hand.size(); i++){
                if(hand.get(i).getColor() == topcard.getColor() || hand.get(i).getValue() == topcard.getValue()
                        || hand.get(i).getValue() == topcard.getValue().WILDCARD){
                    validCard = true;
                }
            }
            if(validCard == true){
                boolean check = false;
                seeHand();
                do{
                    Scanner sc = new Scanner(System.in); 
                    System.out.println("");
                    System.out.print("Please set down a card: ");
                    num = sc.nextInt();
                    if(hand.get(num - 1).getColor() == topcard.getColor() || hand.get(num - 1).getValue() == topcard.getValue()
                        || hand.get(num - 1).getValue() == topcard.getValue().WILDCARD){
                        check = true;
                    }
                }while(check == false);
                
                card.setColor(hand.get(num - 1).getColor());
                card.setValue(hand.get(num - 1).getValue());
                hand.remove(num - 1);
            }else{
                validDraw = drawCard(deck);
                ctr++;
                card = setCard(topcard, false, deck, ctr);
            }
        }else{
            for(int i = 0; i < hand.size(); i++){
                if(hand.get(i).getColor() == topcard.getColor() || hand.get(i).getValue() == topcard.getValue()
                        || hand.get(i).getValue() == topcard.getValue().WILDCARD){
                    card.setColor(hand.get(i).getColor());
                    card.setValue(hand.get(i).getValue());
//                    seeHand();
                    hand.remove(i);
                    i = hand.size();
                }else if(i == hand.size() - 1){
                    if(deck.deck.isEmpty() == false){
                        validDraw = drawCard(deck);
                        card = setCard(topcard, true, deck, ctr);
                        i = hand.size();
                    }
                }
            }
        }
        newHandSize = hand.size() + 1;
        if(newHandSize != handSize && (ctr - 1) == 0){
            System.out.println("Player drew: " + (newHandSize - handSize));
        }
        if(validDraw == false){
            return null;
        }
        return card;
    }
    
    public void checkCard(Cards topcard, Deck deck){
        if(topcard.getValue().equals(topcard.getValue().DRAWTWO)){
            drawTwo(deck);
        }else if(topcard.getValue().equals(topcard.getValue().DRAWFOUR)){
            drawFour(deck);
        }
    }
    public void drawTwo(Deck deck){
        if(deck.deck.size() >= 2){
            for(int i = 0; i < 2; i++){
                drawCard(deck);
            }
            System.out.println("Player drew 2 cards.");
            System.out.println("");
        }else{
            deck.deck.clear();
            System.out.println("Not enough cards left in the deck");
        }
    }
    public void drawFour(Deck deck){
        if(deck.deck.size() >= 4){
            for(int i = 0; i < 4; i++){
                drawCard(deck);
            }
            System.out.println("Player drew 4 cards.");
            System.out.println("");
        }else{
            deck.deck.clear();
            System.out.println("Not enough cards left in the deck");
        }
    }
}
