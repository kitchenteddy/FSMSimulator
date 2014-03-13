/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.keyboardHandler;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import union.codebreakers.helper.Container;

/**
 *
 * @author joshualoew
 */
public class ZeroAction extends AbstractAction {

    private Container container;
    private boolean isPressed;
    
    public ZeroAction(Container container) {
        this.container = container;
        isPressed = false;
    }
    
    /**
     * Getter for isPressed
     * 
     * @return boolean whether or not the key has been pressed
     */
   
    
    
    
    
    
    // THIS NEEDS TO COMMUNICATE WITH CONTROLLER
    // Ask Josh
    
    // VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
    
    
    
    
    
    
    
    public boolean getIsPressed() {
        return isPressed;
    }
    
    /**
     * performs the shift key action
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (isPressed == false) {
            isPressed = true;
        } else {
            isPressed = false;
        }
        
    }
    
}
