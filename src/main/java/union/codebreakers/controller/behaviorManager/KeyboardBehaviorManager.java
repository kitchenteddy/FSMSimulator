package union.codebreakers.controller.behaviorManager;

import union.codebreakers.controller.behaviorManager.keyboardBehavior.KeyboardBehaviorInitial;
import union.codebreakers.controller.behaviorManager.keyboardBehavior.KeyboardBehavior;
import union.codebreakers.controller.behaviorManager.keyboardBehavior.KeyboardBehaviorAddPath;
import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.KeyboardBehaviorType;

/**
 * This class manages instance of every keyboard behavior and switches between them
 */
public class KeyboardBehaviorManager extends BehaviorManager{
    
    static private KeyboardBehaviorInitial kbi = null;
    static private KeyboardBehaviorAddPath kbap = null;
    
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
           case eUnspecified:
                // ignore this one
                return;
           case eInitial:
                if( KeyboardBehaviorManager.kbi == null || refresh){
                    this.initKeyboardBehaviorInitial();
                }
                this.current = KeyboardBehaviorManager.kbi;
                break;
           case eAddPath:
                if( KeyboardBehaviorManager.kbap == null || refresh){
                    this.initKeyboardBehaviorAddPath();
                }
                this.current = KeyboardBehaviorManager.kbap;
                break;
            default:
            case eSimulation:
                // TODO: later
                break;
        }
        this.type = newType;
        this.current.switchToThisBehavior();
    }
    
    /**
     * Gets instance of the current keyboard behavior
     * 
     * @return Instance of the current keyboard behavior
     */
    public KeyboardBehavior getCurrentBehavior(){
        return this.current;
    }
    
    /**
     * Gets type the current keyboard behavior
     * 
     * @return Type of the current keyboard behavior
     */
    public KeyboardBehaviorType getCurrentType(){
        return this.type;
    }
    
    private void initKeyboardBehaviorInitial(){
        KeyboardBehaviorManager.kbi = new KeyboardBehaviorInitial(this);
    }
    
    private void initKeyboardBehaviorAddPath(){
        KeyboardBehaviorManager.kbap = new KeyboardBehaviorAddPath(this);
    }
}
