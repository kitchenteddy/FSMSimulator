package union.codebreakers.model;
import java.awt.Point;
import java.util.ArrayList;
import union.codebreakers.helper.StateType;

/**
 * Automata model
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
    * Adds a state to the automata
    * 
    * @param toAdd state to add
    */
    @Override
    public void addState(State toAdd)
    {
        
    }
    
   /**      
    * Gets the label of a state
    * 
    * @param myState Instance of State
    * @return label of the state
    */
    @Override
    public Label getStateLabel(State myState)
    {
        return null;
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
        return 0;
    }
    
    /**      
    * Gets an iterable of paths from a state
    * @param myState Instance of State
    * @return iterable collecton of a state's outgoing paths
    */
   @Override
    public Iterable<Path> getStatePaths(State myState)
    {
        return null;
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
        return null;
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
        return null;
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
        
    }
        
    /**
    * Gets an iterable collection of the states in the automata
    * 
    * @return Iterable collection of states in the Automata
    */
    @Override
    public Iterable getCollectionStates()
    {
        return this.collectionStates;
    }
}

