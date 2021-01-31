/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int game;
        Scanner sc = new Scanner(System.in);
        System.out.println("What game do you want to play?");
        System.out.println("(1) Rummy");
        System.out.println("(2) Gin Rummy");
        System.out.println("(3) Rummy Argentino");
        System.out.println("(4) Rummykub");
        game = sc.nextInt();

        switch (game) {
            case 1:
                System.out.println("You have chosen Rummy!");
                PlayRummy r = new PlayRummy();
                r.playRummy();
                break;
            case 2:
                System.out.println("You have chosen Gin Rummy!");
                //play game
                break;
            case 3:
                System.out.println("You have chosen Rummy Argentino!");
                //play game
                break;
            case 4:
                System.out.println("You have chosen Rummykub!");
                //play game
                break;
            default:
                System.out.println("You have to enter a number 1-4");
                break;

        }

//TESTING
        /*Deck d = new Deck();
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
        p1.getHand();*/
    }

}
