package union.codebreakers.helper;

import union.codebreakers.command.CommandCenter;
import union.codebreakers.controller.AutomatonController;
import union.codebreakers.controller.MainController;
import union.codebreakers.controller.ObserverView;
import union.codebreakers.controller.ToolbarController;
import union.codebreakers.controller.behaviorManager.KeyboardBehaviorManager;
import union.codebreakers.controller.behaviorManager.MouseBehaviorManager;
import union.codebreakers.controller.simulator.SimulatorManager;
import union.codebreakers.gui.FsmPanel;

/**
 * Container is a class containing useful classes for the window. It enables us to decouple all these classes from every class in which we want to use them.
 * Therefore, it is easier to add a class which should be accessible to more than one class across application in future.
 */
public class Container{
    
    private ToolbarController toolbarController = null;
    private AutomatonController automatonController = null;
    private MainController mainController = null;
    private KeyboardBehaviorManager kbm = null;
    private MouseBehaviorManager mbm = null;
    private FsmPanel drawingArea = null; // actual area for drawing FSM
    private CollisionHandler collisionHandler = null; // collision handler for this FSM
    private CommandCenter commandCenter = null;
    private SimulatorManager simulatorManager = null;
    private ObserverView observerView = null;
    
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

    /**
     * Sets command center for this container
     * 
     * @param newCenter Command center for this container
     */
    public void setCommandCenter(CommandCenter newCenter){
        this.commandCenter = newCenter;
    }

    /**
     * Gets command center for this container
     * 
     * @return command center for this container
     */
    public CommandCenter getCommandCenter(){
        return this.commandCenter;
    }
    
    /**
     * returns the simulator manager
     * @return Simulator Manager
     */
    public SimulatorManager getSimulatorManager(){
        return this.simulatorManager;
        
    }
    
    /**
     * returns the simulator manager
     * @param simulator Simulator Manager
     */
    public void setSimulatorManager(SimulatorManager simulator){
        this.simulatorManager = simulator;
        
    }    

    /**
     * This method sets ObserverView for this container
     * 
     * @param newObserver Instance of ObserverView
     */
    public void setObserverView(ObserverView newObserver ){
        this.observerView = newObserver;
    }

    /**
     * This method gets ObserverView from this container
     * 
     * @return Instance of ObserverView
     */
    public ObserverView getObserverView(){
        return this.observerView;
    }
}
