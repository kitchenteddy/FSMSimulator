package union.codebreakers.controller.behavior;

import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.MouseBehaviorType;

/**
 * This class manages instance of every mouse behavior and switches between them
 */
public class MouseBehaviorManager extends BehaviorManager{

    static private MouseBehaviorInitial mbi = null;
    
    private MouseBehaviorType type;
    private MouseBehavior current = null;

    /**
     * Constructor
     * 
     * @param c Instance of shared container
     */
    public MouseBehaviorManager(Container c) {
        super(c);
    }
    
    /**
     * Sets proper mouse behavior
     * 
     * @param newType New mouse behavior
     * @param refresh Whether should be instance of mouse behavior refreshed
     */
    public void setMouseBehavior(MouseBehaviorType newType, boolean refresh){
        
        switch(newType){
            case eUnspecified:
                // ignore this one
                break;
            case eInitial:
                if( MouseBehaviorManager.mbi == null || refresh){
                    this.initMouseBehaviorInitial();
                }
                this.type = newType;
                this.current = MouseBehaviorManager.mbi;
                break;
            default:
            case eSelected:
                // TODO: later
                break;
        }
    }
    
    /**
     * Gets instance of the current mouse behavior
     * 
     * @return Instance of the current mouse behavior
     */
    public MouseBehavior getCurrentBehavior(){
        return this.current;
    }
    
    /**
     * Gets type the current mouse behavior
     * 
     * @return Type of the current mouse behavior
     */
    public MouseBehaviorType getCurrentType(){
        return this.type;
    }
    
    private void initMouseBehaviorInitial(){
        MouseBehaviorManager.mbi = new MouseBehaviorInitial(this);
    }

}
