package union.codebreakers.controller.behavior;

import java.awt.event.KeyEvent;

/**
 *  Initial keyboard behavior is selected when we are not in simulation mode
 */
public class KeyboardBehaviorInitial extends KeyboardBehavior{

    /**
     * Constructor
     * 
     * @param newKbm Instance of KeyboardBehaviorManager to which this keyboard behavior belongs to
     */
    public KeyboardBehaviorInitial(KeyboardBehaviorManager newKbm) {
        super(newKbm);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
