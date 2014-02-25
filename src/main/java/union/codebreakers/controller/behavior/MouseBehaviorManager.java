package union.codebreakers.controller.behavior;

import union.codebreakers.helper.Container;

/**
 * This class manages instance of every mouse behavior and switches between them
 */
public class MouseBehaviorManager extends BehaviorManager{

    /**
     * Constructor
     * 
     * @param c Instance of shared container
     */
    public MouseBehaviorManager(Container c) {
        super(c);
    }

}
