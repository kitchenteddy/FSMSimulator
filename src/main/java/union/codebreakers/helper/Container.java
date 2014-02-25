package union.codebreakers.helper;

import union.codebreakers.controller.AutomatonController;
import union.codebreakers.controller.ToolbarController;
import union.codebreakers.controller.behavior.KeyboardBehaviorManager;
import union.codebreakers.controller.behavior.MouseBehavior;
import union.codebreakers.controller.behavior.MouseBehaviorManager;

/**
 * Container is a class containing useful classes for the window. It enables us to decouple all these classes from every class in which we want to use them.
 * Therefore, it is easier to add a class which should be accessible to more than one class across application in future. The difference between Container class and
 * ToolsFactory is that we can have several Container tools across the application, if needed (i. e. taking are of multiple graphic canvases), but only one ToolsFactory
 * (one set of formatting tools, graphics tools and etc.)
 */
public class Container{
    
    private ToolbarController toolbarController = null;
    private AutomatonController automatonController = null;
    private MouseBehavior mouseBehavior;
    private KeyboardBehaviorManager kbm = null;
    private MouseBehaviorManager mbm = null;
    
    
    /**
     * Gets pointer to the current toolbar controller
     * 
     * @return instance of toolbar controller
     */
    public ToolbarController getToolbarController(){
        return this.toolbarController;
    }
    
    /**
     * Sets pointer to the current toolbar controller
     * 
     * @param tc Instance of toolbar controller
     */
    public void setToolbarController(ToolbarController tc){
        this.toolbarController = tc;
    }
    
    /**
     * Gets pointer to the current automaton controller
     * 
     * @return instance of automaton controller
     */
    public AutomatonController getAutomatonController(){
        return this.automatonController;
    }
    
    /**
     * Sets pointer to the current automaton controller
     * 
     * @param ac Instance of automaton controller
     */
    public void setAutomatonController(AutomatonController ac){
        this.automatonController = ac;
    }
    
    /**
     * Gets pointer to the current mouse behavior manager
     * 
     * @return instance of mouse behavior manager
     */
    public MouseBehaviorManager getMouseBehaviorManager(){
        return this.mbm;
    }
    
    /**
     * Sets pointer to the current mouse behavior manager
     * 
     * @param newMbm Instance of mouse behavior manager
     */
    public void setMouseBehaviorManager(MouseBehaviorManager newMbm){
        this.mbm = newMbm;
    }
    
    /**
     * Gets pointer to the current keyboard behavior manager
     * 
     * @return instance of keyboard behavior manager
     */
    public KeyboardBehaviorManager getKeyboardBehaviorManager(){
        return this.kbm;
    }
    
    /**
     * Sets pointer to the current keyboard behavior manager
     * 
     * @param newKbm Instance of keyboard behavior manager
     */
    public void setKeyboardBehaviorManager(KeyboardBehaviorManager newKbm){
        this.kbm = newKbm;
    }
}
