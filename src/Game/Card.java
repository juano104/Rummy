/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author juani
 */
public class Card {
    String rank, suit;
    private static String[] SUITS = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private static String[] RANKS = {"Ace", "2", "3", "4", "5",
        "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public static List<String> getValidSuits() {
        return Arrays.asList(SUITS);
    }
    
    public static List<String> getValidRanks() {
        return Arrays.asList(RANKS);
    }

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
                
    }

    public String[] getSUITS() {
        return SUITS;
    }

    public String[] getRANKS() {
        return RANKS;
    }

    public void setSUITS(String[] SUITS) {
        this.SUITS = SUITS;
    }

    public void setRANKS(String[] RANKS) {
        this.RANKS = RANKS;
    }
    
    
    
    @Override
    public String toString() {
        return this.rank + " of " + this.suit;
    }

}
