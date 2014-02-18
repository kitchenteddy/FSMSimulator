package union.codebreakers.model;

/**
 * Interface for Automata model
 */
public  interface Automaton 
{
    
    /**
     * Gets an iterable collection of the states in the automata
     * @return Iterable collection of states in the Automata
     */
    public Iterable<State> getCollectionStates();

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
}