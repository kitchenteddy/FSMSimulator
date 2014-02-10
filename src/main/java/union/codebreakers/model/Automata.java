package union.codebreakers.model;



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
    
   /**      
    *
    * adds a state to the automata
    * @param the state to add
    */
    public void addState(State toAdd);
    
    
    //public void addCollidable(Collidable toAdd);
    

    
}

