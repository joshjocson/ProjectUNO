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
public class Cards {
    
    public enum Color { RED, YELLOW, GREEN, BLUE };
    public enum Value { ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, DRAWTWO, DRAWFOUR, WILDCARD};
    private Color color;      //user defined data type "Color"
    private Value value;    //user defined data type "Value"

    Cards(){

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }   
    
    @Override
    public String toString(){
        return color + " " + value;
    }
}
