package union.codebreakers.model;

/**
 * Interface for every path of an automata (states, paths, labels and etc.)
 */
public interface AutomataPart {
    
    /**
     * Gets instance of automata of which its part of
     * 
     * @return Instance of parent automata
     */
    public Automata getAutomata();
}
