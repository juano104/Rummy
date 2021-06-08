/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juani
 */
public class Deck {

    private ArrayList<Card> deck;

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }
    

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Deck() {
        List<String> suits = Card.getValidSuits();
        List<String> ranks = Card.getValidRanks();

        deck = new ArrayList<>();
        
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }

    }

    public void shuffle() {
        for (int i = 0; i < deck.size(); i++) {
            int j = (int) (Math.random() * deck.size()); // Get a random index out of 52
            Card temp = deck.get(i); // Swap the cards
            deck.set(i, deck.get(j));
            deck.set(j, temp);
        }
    }

    public ArrayList<Card> deal(int size) {
        ArrayList<Card> hand = new ArrayList<>(size);

        for (int dealtCount = 0; dealtCount < size; dealtCount++) {
            hand.add(deck.remove(0));
        }
        return hand;
    }

    public void showDeck() {
        System.out.println("Deck (" + deck.size() + "){" + deck + '}');
        
    }

}
