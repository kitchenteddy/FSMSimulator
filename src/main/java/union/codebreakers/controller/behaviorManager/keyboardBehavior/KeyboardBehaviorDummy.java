/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.behaviorManager.keyboardBehavior;

import union.codebreakers.controller.behaviorManager.keyboardBehavior.KeyboardBehavior;
import java.awt.event.KeyEvent;
import union.codebreakers.controller.behaviorManager.KeyboardBehaviorManager;

/**
 *  Initial keyboard behavior which helps me to reduce lines of code by setting all event responds to false be default
 */
public class KeyboardBehaviorDummy extends KeyboardBehavior{

    /**
     * Constructor
     * 
     * @param newKbm Instance of KeyboardBehaviorManager to which this keyboard behavior belongs to
     */
    public KeyboardBehaviorDummy(KeyboardBehaviorManager newKbm) {
        super(newKbm);
    }

    /**
     * Key was typed
     * 
     * @param ke Information about event
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean keyTyped(KeyEvent ke) {
        return false;
    }

    /**
     * Key was pressed
     * 
     * @param ke Information about event
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean keyPressed(KeyEvent ke) {
        return false;
    }

    /**
     * Key was released
     * 
     * @param ke Information about event
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean keyReleased(KeyEvent ke) {
        return false;
    }
}
