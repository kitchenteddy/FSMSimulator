package union.codebreakers.controller.behaviorManager;

import union.codebreakers.controller.behaviorManager.BehaviorManager;
import union.codebreakers.controller.behaviorManager.mouseBehavior.MouseBehavior;
import union.codebreakers.controller.behaviorManager.mouseBehavior.MouseBehaviorInitial;
import union.codebreakers.controller.behaviorManager.mouseBehavior.MouseBehaviorDragging;
import union.codebreakers.controller.behaviorManager.mouseBehavior.MouseBehaviorDragging;
import union.codebreakers.controller.behaviorManager.mouseBehavior.MouseBehaviorInitial;
import union.codebreakers.controller.behaviorManager.mouseBehavior.MouseBehaviorSelected;
import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.MouseBehaviorType;

/**
 * This class manages instance of every mouse behavior and switches between them
 */
public class MouseBehaviorManager extends BehaviorManager{

    static private MouseBehaviorInitial mbi = null;
    static private MouseBehaviorSelected mbs = null;
    static private MouseBehaviorDragging mbd = null;
    
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
                if( MouseBehaviorManager.mbs == null || refresh){
                    this.initMouseBehaviorSelected();
                }
                this.type = newType;
                this.current = MouseBehaviorManager.mbs;
                break;
            case eDragging:
                if( MouseBehaviorManager.mbd == null || refresh){
                    this.initMouseBehaviorDragging();
                }
                this.type = newType;
                this.current = MouseBehaviorManager.mbd;
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
    
    private void initMouseBehaviorSelected(){
        MouseBehaviorManager.mbs = new MouseBehaviorSelected(this);
    }
    
    private void initMouseBehaviorDragging(){
        MouseBehaviorManager.mbd = new MouseBehaviorDragging(this);
    }
}
