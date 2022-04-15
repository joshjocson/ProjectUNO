/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNO;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Josh
 */
public class Deck {
    
    public ArrayList<Cards> deck = new ArrayList<Cards>();
    public static final int NUM_COLOR = Cards.Color.values().length;
    public static final int NUM_VALUE = Cards.Value.values().length;
    
    Deck(){        
        Cards.Color[] colors = Cards.Color.values();
        Cards.Value[] values = Cards.Value.values();
        for(int i = 0; i < NUM_COLOR; i++){
            Cards.Color color = colors[i];
            for(int j = 0; j < NUM_VALUE; j++){
                Cards.Value value = values[j];
                Cards card = new Cards();
                card.setColor(color);
                card.setValue(value);
                deck.add(card);
            }
        }    
    }
    public Cards draw(){
        Random r = new Random();
        int i = r.nextInt(deck.size());
        Cards card = deck.get(i);
        deck.remove(i);
        return card;
    }
    
    public void seeDeck(){
        for(int i = 0; i < deck.size(); i++){
            System.out.println((i + 1) + ": " + deck.get(i));
        }
    }
}
