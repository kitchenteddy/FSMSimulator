package union.codebreakers.model;
import java.awt.Point;
import java.util.ArrayList;
import union.codebreakers.helper.PathType;
import union.codebreakers.helper.StateType;

/**
 * Automata model
 */
public class ModelAutomata implements Automata
{
	
    public ArrayList<State> collectionStates;
    public ArrayList<Collidable> collectionCollidable;
  
   /**      
    *
    * constructor method for ModelAutomata
    * 
    * @return the new ModelAutamata instance
    */    
    public ModelAutomata(){
	this.collectionStates = new ArrayList<State>();
        this.collectionCollidable = new ArrayList<Collidable>();
     }

    //METHODS INVOLVING STATES IMPLEMENT THEM    
    
   /**      
    * Adds a state to the automata
    * 
    * @param toAdd state to add
    */
    public void addState(State toAdd)
    {
        this.collectionStates.add(toAdd);
        this.collectionCollidable.add(toAdd.getCollidable());
    }
    
   /**      
    * Gets the label of a state
    * 
    * @param myState Instance of State
    * @return label of the state
    */
    public Label getStateLabel(State myState)
    {
        
        return myState.getLabel();
    }
    
    /**      
    * Sets the label of a state to the indicated label
    * 
    * @param myState    Instance of State
    * @param toSet  Instance of Label
    */
    @Override
    public void setStateLabel(State myState, Label toSet)
    {
        myState.setLabel(toSet);
        
    }
    
    /**      
    * Gets the number of paths from a state
    * 
    * @param myState Instance of State
    * @return the number of paths from a given state
    */
    @Override
    public int getStatePathNum(State myState)
    {
        return myState.getPathNum();
    }
    
    /**      
    * Gets an iterable of paths from a state
    * @param myState Instance of State
    * @return iterable collecton of a state's outgoing paths
    */
   @Override
    public Iterable<Path> getStatePaths(State myState)
    {
        return myState.getPaths();
    }
    
    /**      
    * Ggets the position of a state
    * 
    * @param  myState Instance of state
    * @return Point for the position of the state
    */
    @Override
    public Point getStatePos(State myState)
    {
        return myState.getPos();
    }
                 
    /**      
    * Sets the position of a state
    * 
    * @param myState Instance of State
    * @param position  Position on canvas
    */
    @Override
    public void setStatePos(State myState, Point position)
    {
        myState.setPos(position);
    }
    
    /**      
    * Sets the position of a state
    * 
    * @param myState Instance of State
    * @param x  Position on x-axis
    * @param y  Position on y-axis
    */
    @Override
    public void setStatePos(State myState, int x, int y)
    {
        Point myPoint = new Point(x,y);
        myState.setPos(myPoint);
    }
   
    /**
    * Gets the type of a given state
    * 
    * @param myState Instance of state
    * @return StateType of this State
    */
    @Override
    public StateType getStateType(State myState)
    {
        return myState.getType();
    }
    
    /**
    * Sets the type of a given state
    * 
    * @param myState Instance of State
    * @param myType Type of state
    */
    @Override
    public void setStateType(State myState, StateType myType)
    {
        myState.setType(myType);
    }

    
    //AUTOMATA METHODS INVOLVING PATHS
    
    
    /**
     * adds a path to the automata
     * @param newPath 
     */
    public void addPath(Path newPath)
    {
        this.collectionCollidable.add(newPath.getCollidable());
        newPath.getStartPoint().addPath(newPath.getEndPoint());
        
    }

    /**
     * adds a path to the automata
     * @param to
     * @param from
     */
    public void addPath(State from, State to)
    {   
        from.addPath(to);
        this.collectionCollidable.add(this.getPath(from, to).getCollidable());
    }

    /**
     * gets a path from State from to State to.
     * @param from
     * @param to
     */
    public Path getPath(State from, State to)
    {
        
        return from.getPathTo(to);
        
    }
    
    /**
     * removes a path from the automata
     * @param Path toRemove
     */
    public void removePath(Path toRemove)
    {
        this.collectionCollidable.remove(toRemove);
        toRemove.getStartPoint().removePath(toRemove);
    }
    
    /**
     * gets the angle of a path WE NEED TO TALK ABOUT HOW THIS ANGLE IS GOING TO WORK
     * 
     * 
     * 
     * @return int angle of the path
     * @param myPath 
     */
    public int getPathAngle(Path myPath)
    {
        return myPath.getAngle();
    }

    /**
     * sets the angle of a path
     * 
     * @param myPath 
     * @param newAngle
     * 
     */
    public void setPathAngle(Path myPath, int newAngle)
    {
        myPath.setAngle(newAngle);
    }
    
    /**
     * retrieves the label of a path
     * @param myPath 
     * @return Label of the path
     */
    public Label getPathLabel(Path myPath)
    {
        return myPath.getLabel();
    }

    /**
     * sets the label of a path
     * @param myPath 
     * @param newLabel
     */
    public void setPathLabel(Path myPath, Label newLabel)
    {
        myPath.setLabel(newLabel);
    }
    
    /**
     * gets the type of a path
     * @param myPath
     * @return PathType of the path
     */
    public PathType getPathType(Path myPath)
    {
        return myPath.getType();   
    }

    /**
     * sets the type of a path
     * @param myPath 
     * @param newType
     */
    public void setPathType(Path myPath, PathType newType)
    {
        myPath.setType(newType);
    }
        
     /**
     * gets an iterable collection of the states in the automata
     * @return Iterable collection of states in the Automata
     */

    public Iterable getCollectionStates()
    {
        return this.collectionStates;
    }
}

