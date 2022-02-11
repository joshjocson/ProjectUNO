package UNO;

/**
 *
 * @author Josh
 */
public class UNOGame {
    public static void main(String[] args) {
        GenerateCard ch = new GenerateCard();
        ch.generateCard();  //delegated to another class
        for(Cards c: ch.cards){
            System.out.println(c.getColor() + " of " + c.getValue());
        }
    }
}
