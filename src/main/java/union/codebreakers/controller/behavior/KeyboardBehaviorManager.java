package union.codebreakers.controller.behavior;

import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.KeyboardBehaviorType;

/**
 * This class manages instance of every keyboard behavior and switches between them
 */
public class KeyboardBehaviorManager extends BehaviorManager{
    
    static private KeyboardBehaviorInitial kbi = null;
    
    private KeyboardBehaviorType type;
    private KeyboardBehavior current = null;

    /**
     * Constructor
     * 
     * @param c Instance of shared container
     */
    public KeyboardBehaviorManager(Container c) {
        super(c);
    }
    
    /**
     * Sets proper keyboard behavior
     * 
     * @param newType New keyboard behavior
     * @param refresh Whether should be instance of keyboard behavior refreshed
     */
    public void setKeyboardBehavior(KeyboardBehaviorType newType, boolean refresh){
        
        switch(newType){
            case eInitial:
                if( KeyboardBehaviorManager.kbi == null || refresh){
                    this.initKeyboardBehaviorInitial();
                }
                this.type = newType;
                this.current = KeyboardBehaviorManager.kbi;
                break;
            default:
            case eSimulation:
                // TODO: later
                break;
        }
    }
    
    /**
     * Gets instance of the current keyboard behavior
     * 
     * @return Instance of the current keyboard behavior
     */
    public KeyboardBehavior getCurrentBehavior(){
        return this.current;
    }
    
    private void initKeyboardBehaviorInitial(){
        KeyboardBehaviorManager.kbi = new KeyboardBehaviorInitial(this);
    }
}
