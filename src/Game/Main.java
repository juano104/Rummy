/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author juani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Card c = new Card("3", "Diamonds");
        System.out.println(c);*/
        Deck d = new Deck();
        Pit p = new Pit();
        d.showDeck();
        d.shuffle();
        d.showDeck();
        System.out.println("Making 2 players, handing cards");
        Player p1 = new Player("Tomeu");
        Player p2 = new Player("Pep");
        p1.setHand(d.deal(10));
        p2.setHand(d.deal(10));
        
        p1.showHand();
        p2.showHand();
        d.showDeck();
        p1.pickFromDeck(d.getDeck());
        p1.showHand();
        d.showDeck();
        p.showPit();
        //here we choose the pit and the position of which card we want to put in from our hand
        p1.putInPit(p.getPit(), 1);
        p.showPit();
        p1.showHand();
        p1.getHand();
    }
    
}
