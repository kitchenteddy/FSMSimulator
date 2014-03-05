package union.codebreakers.controller.behaviorManager.keyboardBehavior;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import union.codebreakers.controller.behaviorManager.KeyboardBehaviorManager;

/**
 * The simplest keyboard behavior which accepts KeyboardBehaviorManager in its constructor.
 * Every keyboard behavior have to extend this class
 */
public abstract class KeyboardBehavior {

    private HashMap<String, Boolean> mode;
    
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
        this.mode = new HashMap<String, Boolean>();
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
    
    /**
     * Sets mode for this keyboard behavior
     * 
     * @param key       Name of mode
     * @param state     State of mode
     */
    protected void setMode( String key,  Boolean state){
       this.mode.put(key, state);            
    }
    
    /**
     * Gets status of a mode
     * 
     * @param key       Name of mode
     * 
     * @return Status of the mode (if the mode wasnt set, returns false)
     */
    public boolean getMode( String key){
        if( this.mode.containsKey(key)){
            return (boolean)this.mode.get(key);
        } else {
            return false;
        }
    }
    
    /**
     * This method is triggered when keyboard manager switches to this behavior
     * 
     */
    public abstract void switchToThisBehavior();
    
    /**
     * Resets central container for keeping track of modes for this keyboard behavior
     */
    public void resetMode(){
        this.mode.clear();
    }
}
