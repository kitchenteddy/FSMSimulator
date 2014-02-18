package union.codebreakers.model;

import java.io.Serializable;
import java.util.ArrayList;
import union.codebreakers.model.Collidable;

/**
 * Automaton model
 */
public class ModelAutomaton implements Automaton, Serializable
{
    public ArrayList<State> collectionStates;
    public ArrayList<Collidable> collectionCollidable;
  
   /**      
    * Constructor method for ModelAutomaton
    */    
    public ModelAutomaton(){
	this.collectionStates = new ArrayList<State>();
        this.collectionCollidable = new ArrayList<Collidable>();
     }
    
   /**      
    * Adds a state to the automaton
    * 
    * @param toAdd state to add
    */
    @Override
    public void addState(State toAdd)
    {
        this.collectionStates.add(toAdd);
        this.addCollidable((Collidable)toAdd);
    }
    
   /**      
    * Removes a state from the automaton
    * 
    * @param el State to delete
    */
    @Override
    public void removeState(State el)
    {
        this.collectionStates.remove(el);
        this.removeCollidable((Collidable)el);
    }

     /**
     * gets an iterable collection of the states in the automata
     * @return Iterable collection of states in the Automata
     */
    @Override
    public Iterable getCollectionStates()
    {
        return this.collectionStates;
    }
    
    /**
     * Adds a collidable element to collection
     * 
     * @param element Collidable element
     */
    @Override
    public void addCollidable(Collidable element){
        boolean res = this.existCollidable(element);
        if( res == false ){
            this.collectionCollidable.add(element);
        }
    }
    
    /**
     * Checks, if this element isnt already in the collection
     * 
     * @param el Collidable element
     * @return whether the element is already in the collection or not
     */
    private boolean existCollidable(Collidable el){
        boolean result = false;
        for( Collidable c : this.collectionCollidable) {
            if( c == el ){
                result = true;
                break;
            }
        }
        
        return result;
    }

    /**
     * Removes a collidable element from collection
     * 
     * @param element Collidable element
     * 
     * @return Whether the element was removed from the collection
     */
    @Override
    public boolean removeCollidable(Collidable element){
        boolean res = this.existCollidable(element);
        if( res ){
            return this.collectionCollidable.remove(res);
        } else { // cant remove element which doesnt exist
            return false;
        }        
    }
}

