package union.codebreakers.model;
import java.awt.Point;
import java.util.ArrayList;
import union.codebreakers.helper.PathType;
import union.codebreakers.helper.StateType;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
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
    *
    * adds a state to the automata
    * @param the state to add
    */
    public void addState(State toAdd)
    {
        this.collectionStates.add(toAdd);
        this.collectionCollidable.add(toAdd.getCollidable());
        
        
    }
    
   /**      
    *   gets the label of a state
    * 
    * @return label of the state
    * @param myState
    */
    public Label getStateLabel(State myState)
    {
        
        return myState.getLabel();
    }
    
    
    /**      
    *
    * sets the label of a state to the indicated label
    * 
    * @param myState
    * @param toSet
    */
    public void setStateLabel(State myState, Label toSet)
    {
        myState.setLabel(toSet);
        
    }
    
    
    /**      
    *   gets the number of paths from a state
    * @return the number of paths from a given state
    * @param myState
    */
    public int getStatePathNum(State myState)
    {
        return myState.getPathNum();
    }
    
    
    /**      
    * gets an iterable of paths from a state
    * @return iterable collecton of a state's outgoing paths
    * @param myState
    */
    public Iterable<Path> getStatePaths(State myState)
    {
        return myState.getPaths();
    }
    
    
    /**      
    *   gets the position of a state
    * @return Point for the position of the state
    * @param  myState
    */
    public Point getStatePos(State myState)
    {
        return myState.getPos();
    }
                 
    
    
    /**      
    *
    * sets the position of a state
    * 
    * @param myState
    * @param position
    */
    public void setStatePos(State myState, Point position)
    {
        myState.setPos(position);
    }
    
    /**      
    *
    * sets the position of a state
    * 
    * @param myState
    * @param x
    * @param y
    */
    public void setStatePos(State myState, int x, int y)
    {
        Point myPoint = new Point(x,y);
        myState.setPos(myPoint);
    }
   
    
    /**      
    *
    * gets the type of a given state
    * @return StateType of this State
    * @param myState
    */
    public StateType getStateType(State myState)
    {
        return myState.getType();
    }
    
    
    /**      
    *sets the type of a given state
    * @param myState
    * @param myType
    */
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

