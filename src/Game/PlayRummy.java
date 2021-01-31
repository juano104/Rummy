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
public class PlayRummy {
    //boolean play = false;
    
    public void playRummy(){
        //here make the game
        //making scanners to input the players
        System.out.println("Insert two players:");
        System.out.println("Name of Player 1:");
        Scanner scannerp1 = new Scanner(System.in);
        String namep1 = scannerp1.nextLine();
        Player p1 = new Player(namep1);
        System.out.println("Name of Player 2:");
        Scanner scannerp2 = new Scanner(System.in);
        String namep2 = scannerp2.nextLine();
        Player p2 = new Player(namep2);
        p1.showInfo();
        p2.showInfo();
        System.out.println("Now we make a deck and shuffle it");
        Deck d = new Deck();
        Pit p = new Pit();
        d.showDeck();
        p.showPit();
        System.out.println("*****Shuffling deck*****");
        d.shuffle();
        System.out.println("Next step: deal 10 cards to every player");
        p1.setHand(d.deal(10));
        p2.setHand(d.deal(10));
        System.out.println(p1.getName() +" has " + p1.getHand().size() + " cards");
        System.out.println(p2.getName() +" has " + p2.getHand().size() + " cards");
        System.out.println(p1.getName() + " will go first!");
        
        //player 1 starts playing
        if(p1.isTurn()){
            //System.out.println("");
            
            
        }
        
    }
}
