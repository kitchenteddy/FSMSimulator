package union.codebreakers.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
        
        for (Path myPath: el.getPaths()){
            el.removePath(myPath);
            if (myPath instanceof ModelPath){
                
                this.removeCollidable((Collidable)myPath);
                System.out.println("in model automaton removed collidable");
            }
        }
        
        this.collectionStates.remove(el);
        this.removeCollidable((Collidable)el);
        
        // check other states, if they have outgoing paths to this state => if so, remove those paths
//        for( State state : this.collectionStates) {
//            
//            
//            for(Path path : state.getPaths() ){
//                
//                //if self path
//                if( path.getEndPoint().equals(state) ){
//                    state.removePath(path);
//                    this.removeCollidable((ModelPath)path);
//                }
//            }
//            for (Path path : state.getIncomingPaths()){
//                if (path.getEndPo
//            }
       
    }

     /**
     * gets an iterable collection of the states in the automata
     * @return Iterable collection of states in the Automata
     */
    @Override
    public List<State> getCollectionStates()
    {
        return (List<State>)this.collectionStates;
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
     * Gets a list of collidables
     * 
     * @return list of collidables
     */
    @Override
    public List<Collidable> getCollectionCollidables(){
        return this.collectionCollidable;
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

