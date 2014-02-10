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
    
   
    
    





//AUTOMATA METHODS INVOLVING PATHS
    
    
    
    
    
    
    
    /**
     * adds a path to the automata
     * @param newPath 
     */
    public void addPath(Path newPath);
    
    /**
     * returns true iff state from has an outgoing path to state to
     * @param from
     * @param to
     */
    public boolean hasPath(State from, State to);
    
    
    /**
     * gets a path from State from to State to.
     * @param from
     * @param to
     */
    public Path getPath(State from, State to);
    
    
    /**
     * removes a path from the automata
     * @param Path toRemove
     */
    public void removePath(Path toRemove);
    
    
    /**
     * gets the angle of a path WE NEED TO TALK ABOUT HOW THIS ANGLE IS GOING TO WORK
     * 
     * 
     * 
     * @return int angle of the path
     * @param myPath 
     */
    public int getPathAngle(Path myPath);
    
    
    
    
    /**
     * sets the angle of a path
     * 
     * @param myPath 
     * @param newAngle
     * 
     */
    public void setPathAngle(Path myPath, int newAngle);
    
    
    
    /**
     * retrieves the label of a path
     * @param myPath 
     * @return Label of the path
     */
    public Label getPathLabel(Path myPath);
    
    
    
    
    /**
     * sets the label of a path
     * @param myPath 
     * @param newLabel
     */
    public void setPathLabel(Path myPath, Label newLabel);
    
    
    /**
     * gets the type of a path
     * @param myPath
     * @return PathType of the path
     */
    public PathType getPathType(Path myPath);
    
    
    
    
    /**
     * sets the type of a path
     * @param myPath 
     * @param newType
     */
    public void setPathType(Path myPath, PathType newType);
    
 
    
    
    
    
    
    
    
    

    
}

