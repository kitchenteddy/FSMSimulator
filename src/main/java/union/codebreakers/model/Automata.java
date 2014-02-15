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
    * Gets the position of a state
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
    
    //AUTOMATA METHODS INVOLVING PATHS

    /**
     * adds a path to the automata
     * @param to
     * @param from
     */
    public void addPath(State from, State to);
    
    /**
     * adds a path to the automata
     * @param newPath 
     */
    public void addPath(Path newPath);
    
    /**
     * gets a path from State from to State to.
     * @param from Instance of State (beginning of path)
     * @param to Instance of State (end of path)
     * @return Instance of Path between these two states
     */
    public Path getPath(State from, State to);
    
    /**
     * removes a path from the automata
     * @param toRemove
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

