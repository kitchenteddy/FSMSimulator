/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.simulator;

import java.awt.Point;

/**
 * 
 * interperets text and gives position information for drawer
 * 
 * 
 * @author teddykitchen
 */
public interface Simulation {
    
    /**
     * 
     * takes a string for input and changes states if possible.
     * returns true if the input results in a change.
     * 
     * @return true if the input was a valid move, false otherwise 
     */
    public boolean processIput(String input);
    
    
    
    /**
     * gets the position of the currently selected state
     * @return Point position of state
     */
    public Point getSelectedPosition();
    
   
        
    
    
}
