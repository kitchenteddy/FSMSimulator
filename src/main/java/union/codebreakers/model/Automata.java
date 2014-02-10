package union.codebreakers.model;
import java.awt.Point;
import union.codebreakers.helper.*;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface Automata 
{
    
    /**
     * gets an iterable collection of the states in the automata
     * @return Iterable collection of states in the Automata
     */
    public Iterable<State> getCollectionStates();
    

    
    
    //public void addCollidable(Collidable toAdd);
    
    
    
    //METHODS INVOLVING STATES
    
   /**      
    *
    * adds a state to the automata
    * @param the state to add
    */
    public void addState(State toAdd);
    
   /**      
    *   gets the label of a state
    * 
    * @return label of the state
    * @param myState
    */
    
    public Label getStateLabel(State myState);
    
    
    /**      
    *
    * sets the label of a state to the indicated label
    * 
    * @param myState
    * @param toSet
    */
    public void setStateLabel(State myState, Label toSet);
    
    
    /**      
    *   gets the number of paths from a state
    * @return the number of paths from a given state
    * @param myState
    */
    public int getStatePathNum(State myState);
    
    
    /**      
    * gets an iterable of paths from a state
    * @return iterable collecton of a state's outgoing paths
    * @param myState
    */
    public Iterable<Path> getStatePaths(State myState);
    
    
    /**      
    *   gets the position of a state
    * @return Point for the position of the state
    * @param  myState
    */
    public Point getStatePos(State myState);
    
    
    /**      
    *
    * sets the position of a state
    * 
    * @param myState
    * @param position
    */
    public void setStatePos(State myState, Point position);
    
    /**      
    *
    * sets the position of a state
    * 
    * @param myState
    * @param x
    * @param y
    */
    public void setStatePos(State myState, int x, int y);
   
    
    /**      
    *
    * gets the type of a given state
    * @return StateType of this State
    * @param myState
    */
    public StateType getStateType(State myState);
    
    
    /**      
    *sets the type of a given state
    * @param myState
    * @param myType
    */
    public void setStateType(State myState, StateType myType);
    
   
    
    
    
    
    
    
    

    
}

