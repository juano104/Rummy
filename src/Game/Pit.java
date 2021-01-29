/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.ArrayList;

/**
 *
 * @author juani
 */
public class Pit {
    private ArrayList<Card> pit;

    public ArrayList<Card> getPit() {
        return pit;
    }

    public void setPit(ArrayList<Card> pit) {
        this.pit = pit;
    }

    public Pit() {
        this.pit = new ArrayList<>();
    }
    
    public void showPit() {
        System.out.println("Pit (" + pit.size() + "){" + pit + '}');
        
    }
    
    
    
    
}
