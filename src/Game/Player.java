/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Rummy.*;
import java.util.ArrayList;

/**
 *
 * @author juani
 */
public class Player {

    private boolean turn;
    private String name;
    private int points;
    private ArrayList<Card> hand;

    public boolean isTurn() {
        return turn;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public Player(String name) {
        this.name = name;
    }


    public void showHand() {
        System.out.println(this.name + " (" + hand.size() + ")" + "{" + hand + '}');
        //return this.name + " (" + hand.size() + ")" + "{" + hand + '}';
    }
    
    public void showInfo() {
        System.out.println(this.name + ", Points(" + this.points + ")");
        //return this.name + " (" + hand.size() + ")" + "{" + hand + '}';
    }
    
    //here i start making the player's decisions

    public void pickFromDeck(ArrayList<Card> deck) {
        hand.add(deck.remove(0)); //grabs first card from the deck

    }
    
    public void pickFromPit(ArrayList<Card> pit) {
        hand.add(pit.remove(0)); //grabs first card from the deck

    }

    public void putInPit(ArrayList<Card> pit, int position) {
        pit.add(hand.remove(position - 1));
    }
    
    /*public void setPlay(ArrayList<Card> play){
        Play p = new Play(play);
        
    }*/
    
    public void meld(Card card, ArrayList<Card> play){
        
    }

}
