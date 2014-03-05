package union.codebreakers.controller.behaviorManager.keyboardBehavior;

import java.awt.event.KeyEvent;
import union.codebreakers.controller.behaviorManager.KeyboardBehaviorManager;

/**
 * The simplest keyboard behavior which accepts KeyboardBehaviorManager in its constructor.
 * Every keyboard behavior have to extend this class
 */
public abstract class KeyboardBehavior {

    /**
     * Instance of KeyboardBehaviorManager
     */
    protected KeyboardBehaviorManager kbm;

    /**
     * Constructor
     * 
     * @param newKbm Instance of KeyboardBehaviorManager to which this keyboard behavior belongs to
     */
    public KeyboardBehavior(KeyboardBehaviorManager newKbm) {
        this.kbm = newKbm;
    }
    
    /**
     * Key was typed
     * 
     * @param ke Information about event
     * 
     * @return Whether the drawing area should be repainted
     */
    public abstract boolean keyTyped(KeyEvent ke);

    /**
     * Key was pressed
     * 
     * @param ke Information about event
     * 
     * @return Whether the drawing area should be repainted
     */
    public abstract boolean keyPressed(KeyEvent ke);

    /**
     * Key was released
     * 
     * @param ke Information about event
     * 
     * @return Whether the drawing area should be repainted
     */
    public abstract boolean keyReleased(KeyEvent ke);
}
