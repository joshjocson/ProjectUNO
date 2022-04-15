/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package UNO;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;


/**
 *
 * @author Josh
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @Before
    public void setUp() throws Exception{
        
    }
    @After
    public void tearDown() throws Exception{
        
    }

    /**
     * Test of drawCard method, of class Player.
     */
    @Test
    public void testDrawCardGood() {
        System.out.println("drawCard Good");
        Deck deck = new Deck();
//        Player instance = new Player();
        boolean expResult = true;
        boolean result = deck.deck.isEmpty() == false;
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDrawCardBad() {
        System.out.println("drawCard Bad");
        Deck deck = new Deck();
//        Player instance = new Player();
        boolean expResult = false;
        boolean result = deck.deck.isEmpty() == true;
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDrawCardBoundary() {
        System.out.println("drawCard Boundary");
        Deck deck = new Deck();
//        Player instance = new Player();
        boolean expResult = false;
        boolean result = deck.deck.isEmpty();
        assertEquals(expResult, result);
    }
    /**
     * Test of checkCard method, of class Player.
     */
    @Test
    public void testCheckCardDrawTwoGood() {
        System.out.println("checkCardDrawTwo Good");
        Deck deck = new Deck();
        Player p = new Player();
        Cards topcard = deck.draw();
//        Cards c = new Cards();
//        p.setCard(topcard, true, deck, 0);
        boolean expResult = false;
        boolean result = topcard.getValue().equals(topcard.getValue().DRAWTWO);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckCardDrawTwoBad() {
        System.out.println("checkCardDrawTwo Bad");
        Deck deck = new Deck();
        Player p = new Player();
        Cards topcard = deck.draw();
//        Cards c = new Cards();
//        p.setCard(topcard, true, deck, 0);
        boolean expResult = true;
        boolean result = topcard.getValue() != (topcard.getValue().DRAWTWO);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckCardDrawTwoBoundary() {
        System.out.println("checkCardDrawTwo Boundary");
        Deck deck = new Deck();
        Player p = new Player();
        Cards topcard = deck.draw();
//        Cards c = new Cards();
//        p.setCard(topcard, true, deck, 0);
        boolean expResult = false;
        boolean result = topcard.getValue() == null;
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckCardDrawFourGood() {
        System.out.println("checkCardDrawFour Good");
        Deck deck = new Deck();
        Player p = new Player();
        Cards topcard = deck.draw();
//        Cards c = new Cards();
//        p.setCard(topcard, true, deck, 0);
        boolean expResult = false;
        boolean result = topcard.getValue().equals(topcard.getValue().DRAWFOUR);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckCardDrawFourBad() {
        System.out.println("checkCardDrawFour Bad");
        Deck deck = new Deck();
        Player p = new Player();
        Cards topcard = deck.draw();
//        Cards c = new Cards();
//        p.setCard(topcard, true, deck, 0);
        boolean expResult = true;
        boolean result = topcard.getValue() != (topcard.getValue().DRAWFOUR);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckCardDrawFourBoundary() {
        System.out.println("checkCardDrawFour Boundary");
        Deck deck = new Deck();
        Player p = new Player();
        Cards topcard = deck.draw();
//        Cards c = new Cards();
//        p.setCard(topcard, true, deck, 0);
        boolean expResult = false;
        boolean result = topcard.getValue() == null;
        assertEquals(expResult, result);
    }
//    @Test
//    public void testCheckCardBad(Cards topcard) {
//        System.out.println("checkCard Bad");
//        Deck deck = new Deck();
//        boolean expResult = false;
//        boolean result = topcard.getValue() != (topcard.getValue().DRAWTWO);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testCheckCardBoundary(Cards topcard) {
//        System.out.println("checkCard Boundary");
//        Deck deck = new Deck();
//        boolean expResult = false;
//        boolean result = topcard.getValue() = 0;
//    }
    
    @Test
    public void testDrawTwoGood() {
        System.out.println("drawTwo Good");
        Deck deck = new Deck();
        Player instance = new Player();
        boolean expResult = true;
        boolean result = deck.deck.size() >= 2;
        assertEquals(expResult, result);
    }
    @Test
    public void testDrawTwoBad() {
        System.out.println("drawTwo Bad");
        Deck deck = new Deck();
//        Player instance = new Player();
        boolean expResult = false;
        boolean result = deck.deck.size() < 2;
        assertEquals(expResult, result);
    }
    @Test
    public void testDrawTwoBoundary() {
        System.out.println("drawTwo Boundary");
        Deck deck = new Deck();
        Player instance = new Player();
        boolean expResult = true;
        boolean result = deck.deck.size() > 0;
        assertEquals(expResult, result);
    }
    /**
     * Test of drawFour method, of class Player.
     */
    @Test
    public void testDrawFourGood() {
        System.out.println("drawFour Good");
        Deck deck = new Deck();
        Player instance = new Player();
        boolean expResult = true;
        boolean result = deck.deck.size() >= 4;
        assertEquals(expResult, result);
    }
    @Test
    public void testDrawFourBad() {
        System.out.println("drawFour Bad");
        Deck deck = new Deck();
        Player instance = new Player();
        boolean expResult = false;
        boolean result = deck.deck.size() < 4;
        assertEquals(expResult, result);
    }
    @Test
    public void testDrawFourBoundary() {
        System.out.println("drawFour Boundary");
        Deck deck = new Deck();
        Player instance = new Player();
        boolean expResult = true;
        boolean result = deck.deck.size() > 0;
        assertEquals(expResult, result);
    }
}
