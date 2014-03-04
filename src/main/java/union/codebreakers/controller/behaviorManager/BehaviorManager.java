package union.codebreakers.controller.behaviorManager;

import union.codebreakers.helper.Container;

/**
 *  Abstract class defining mutual signature for both types of behavior managers (keyboard and mouse)
 */
public abstract class BehaviorManager {

    protected Container container;

    /**
     * Constructor
     * 
     * @param c Instance of shared container
     */
    public BehaviorManager(Container c){
        this.container = c;
    }
    
    /**
     * Gets instance of container
     * 
     * @return instance of container
     */
    public Container getContainer(){
        return this.container;
    }
}
