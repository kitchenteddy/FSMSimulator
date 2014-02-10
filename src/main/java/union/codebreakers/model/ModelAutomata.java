package union.codebreakers.model;
import java.awt.Point;
import java.util.ArrayList;
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
        
    }
    
   /**      
    *   gets the label of a state
    * 
    * @return label of the state
    * @param myState
    */
    
    public Label getStateLabel(State myState)
    {
        return null;
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
        
    }
    
    
    /**      
    *   gets the number of paths from a state
    * @return the number of paths from a given state
    * @param myState
    */
    public int getStatePathNum(State myState)
    {
        return 0;
    }
    
    
    /**      
    * gets an iterable of paths from a state
    * @return iterable collecton of a state's outgoing paths
    * @param myState
    */
    public Iterable<Path> getStatePaths(State myState)
    {
        return null;
    }
    
    
    /**      
    *   gets the position of a state
    * @return Point for the position of the state
    * @param  myState
    */
    public Point getStatePos(State myState)
    {
        return null;
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
        
    }
   
    
    /**      
    *
    * gets the type of a given state
    * @return StateType of this State
    * @param myState
    */
    public StateType getStateType(State myState)
    {
        return null;
    }
    
    
    /**      
    *sets the type of a given state
    * @param myState
    * @param myType
    */
    public void setStateType(State myState, StateType myType)
    {
        
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

