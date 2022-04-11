/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNO;

import java.util.Random;

/**
 *
 * @author Josh
 */
public class Deck {
    
    public Cards[][] deck;
    public static final int NUM_COLOR = Cards.Color.values().length;
    public static final int NUM_VALUE = Cards.Value.values().length;
    
    Deck(){
        deck = new Cards[NUM_VALUE][NUM_VALUE];
        
        Cards.Color[] colors = Cards.Color.values();
        Cards.Value[] values = Cards.Value.values();
        for(int i = 0; i < NUM_COLOR; i++){
            Cards.Color color = colors[i];
            for(int j = 0; j < NUM_VALUE; j++){
                Cards.Value value = values[j];
                deck[i][j] = new Cards(color, value);
            }
        }    
    }
    public Cards draw(){

        Random r = new Random();
        int randomColor = r.nextInt(NUM_COLOR);
        int randomValue = r.nextInt(NUM_VALUE);
        return deck[randomColor][randomValue];
    }
    
//    public void shuffle(){
//        GenerateCard ch = new GenerateCard();
//        ch.generateCard(); 
//        for(Cards c: ch.getCards()){
//            int random = (Math.random())
//        }
//    }
}
