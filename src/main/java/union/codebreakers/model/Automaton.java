package union.codebreakers.model;

import java.util.List;

/**
 * Interface for Automata model
 */
public  interface Automaton 
{
    
    /**
     * Gets a list collection of the states in the automata
     * @return List collection of states in the Automata
     */
    public List<State> getCollectionStates();

    /**
     * Gets a list of collidables
     * 
     * @return list of collidables
     */
    public List<Collidable> getCollectionCollidables();

    /**      
    * Adds a state to the automata
    * 
    * @param toAdd state to add
    */
    public void addState(State toAdd);

    /**      
    * Removes a state from the automaton
    * 
    * @param el State to delete
    */
    public void removeState(State el);
    
    /**
     * Adds a collidable element to collection
     * 
     * @param element Collidable element
     */
    public void addCollidable(Collidable element);

    /**
     * Removes a collidable element from collection
     * 
     * @param element Collidable element
     * 
     * @return Whether the element was removed from the collection
     */
    public boolean removeCollidable(Collidable element);
    
    
    
    /**
     * gets the starting state of this FSM
     * if no starting state, returns a different state
     * if no states in FSM returns null
     * @return State, starting state
     */
    public State getStartingState();
    
    
}