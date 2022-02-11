/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNO;

/**
 *
 * @author Josh
 */
public class GenerateCard {
    private int handSize = 60;
    public Cards[] cards = new Cards[handSize]; //Array of Object
    
    public void generateCard(){
        int countCards = 0;
        for(Cards.Color c:Cards.Color.values()){    //for each loop
            for(Cards.Value v: Cards.Value.values()){
                cards[countCards] = new Cards(c, v); //creates object of Card
                countCards++;
            }
        }
    }
}
