package union.codebreakers.model;

/**
 * Interface for every path of an automaton (states, paths, labels and etc.)
 */
public interface AutomatonPart {
    
    /**
     * Gets instance of automaton of which its part of
     * 
     * @return Instance of parent automaton
     */
    public Automaton getAutomaton();
}
