package union.codebreakers.helper;

import union.codebreakers.controller.AutomatonController;
import union.codebreakers.controller.MainController;
import union.codebreakers.controller.ToolbarController;
import union.codebreakers.controller.behavior.KeyboardBehaviorManager;
import union.codebreakers.controller.behavior.MouseBehavior;
import union.codebreakers.controller.behavior.MouseBehaviorManager;
import union.codebreakers.gui.FsmPanel;
import union.codebreakers.model.Collidable;
import union.codebreakers.model.State;

/**
 * Container is a class containing useful classes for the window. It enables us to decouple all these classes from every class in which we want to use them.
 * Therefore, it is easier to add a class which should be accessible to more than one class across application in future. The difference between Container class and
 * ToolsFactory is that we can have several Container tools across the application, if needed (i. e. taking are of multiple graphic canvases), but only one ToolsFactory
 * (one set of formatting tools, graphics tools and etc.)
 */
public class Container{
    
    private ToolbarController toolbarController = null;
    private AutomatonController automatonController = null;
    private MainController mainController = null;
    private MouseBehavior mouseBehavior;
    private KeyboardBehaviorManager kbm = null;
    private MouseBehaviorManager mbm = null;
    private FsmPanel drawingArea = null; // actual area for drawing FSM
    private CollisionHandler collisionHandler = null; // collision handler for this FSM
    
    /**
     * Gets pointer to the current main controller
     * 
     * @return instance of main controller
     */
    public MainController getMainController(){
        return this.mainController;
    }
    
    /**
     * Sets pointer to the current main controller
     * 
     * @param mc Instance of main controller
     */
    public void setMainController(MainController mc){
        this.mainController = mc;
    }
    
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

    /**
     * Sets current drawing area
     * 
     * @param newFsmPanel New view
     */
    public void setDrawingArea(FsmPanel newFsmPanel){
        this.drawingArea = newFsmPanel;
    }

    /**
     * Gets current drawing area
     * 
     * @return Drawing area
     */
    public FsmPanel getDrawingArea(){
        return this.drawingArea;
    }

    /**
     * Sets collision handler for this container
     * 
     * @param newHandler Collision handler for this container
     */
    public void setCollisionHandler(CollisionHandler newHandler){
        this.collisionHandler = newHandler;
    }

    /**
     * Gets collision handler for this container
     * 
     * @return collision handler for this container
     */
    public CollisionHandler getCollisionHandler(){
        return this.collisionHandler;
    }
}
