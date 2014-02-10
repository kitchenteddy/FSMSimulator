package union.codebreakers.model;
import java.awt.Point;
import union.codebreakers.helper.*;

/**
 * Interface for Automata model
 */
public  interface Automata 
{
    
    /**
     * Gets an iterable collection of the states in the automata
     * @return Iterable collection of states in the Automata
     */
    public Iterable<State> getCollectionStates();
    
    //public void addCollidable(Collidable toAdd);
    
    
    
    //METHODS INVOLVING STATES
   /**      
    * Adds a state to the automata
    * 
    * @param toAdd state to add
    */
    public void addState(State toAdd);
    
   /**      
    * Gets the label of a state
    * 
    * @param myState Instance of State
    * @return label of the state
    */
    public Label getStateLabel(State myState);
        
    /**      
    * Sets the label of a state to the indicated label
    * 
    * @param myState    Instance of State
    * @param toSet  Instance of Label
    */
    public void setStateLabel(State myState, Label toSet);
    
    /**      
    * Gets the number of paths from a state
    * 
    * @param myState Instance of State
    * @return the number of paths from a given state
    */
    public int getStatePathNum(State myState);
    
    /**      
    * Gets an iterable of paths from a state
    * @param myState Instance of State
    * @return iterable collecton of a state's outgoing paths
    */
    public Iterable<Path> getStatePaths(State myState);
    
    
    /**      
    * Ggets the position of a state
    * 
    * @param  myState Instance of state
    * @return Point for the position of the state
    */
    public Point getStatePos(State myState);
    
    /**      
    * Sets the position of a state
    * 
    * @param myState Instance of State
    * @param position  Position on canvas
    */
    public void setStatePos(State myState, Point position);
    
    /**      
    * Sets the position of a state
    * 
    * @param myState Instance of State
    * @param x  Position on x-axis
    * @param y  Position on y-axis
    */
    public void setStatePos(State myState, int x, int y);
    
    /**
    * Gets the type of a given state
    * 
    * @param myState Instance of state
    * @return StateType of this State
    */
    public StateType getStateType(State myState);
    
    /**
    * Sets the type of a given state
    * 
    * @param myState Instance of State
    * @param myType Type of state
    */
    public void setStateType(State myState, StateType myType);
}

