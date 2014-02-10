package union.codebreakers.model;
import java.util.ArrayList;



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
        
        
        
        /**
         * 
         * adds a state to the automata
         * @param the state to add
        */
        public void addState(State toAdd)
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

