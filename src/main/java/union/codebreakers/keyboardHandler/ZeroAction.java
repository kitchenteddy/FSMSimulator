/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.keyboardHandler;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.MouseBehaviorType;

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
    
    public boolean getIsPressed() {
        return isPressed;
    }
    
    /**
     * performs the shift key action
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {   
        
        Graphics g = container.getDrawingArea().getGraphics();
        g.setColor(Color.red);

                
        // Test if the button has been pressed, change the boolean
        
        if (isPressed == false) {
            isPressed = true;
            g.fillRect(0, 0, 10, 10);
        } else {
            isPressed = false;
            g.setColor(Color.black);
            g.fillRect(0, 0, 10, 10);
        }
                
        // Make sure that the button has been pressed
        
        if((container.getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected) && (isPressed == true)) {
            //this.kbm.setKeyboardBehavior(KeyboardBehaviorType.eAddPath, false);
        }
        
    }
    
}
