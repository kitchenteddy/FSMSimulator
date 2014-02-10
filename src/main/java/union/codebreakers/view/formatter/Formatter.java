package union.codebreakers.view.formatter;

import union.codebreakers.model.Automata;

/**
 *  Interface for every formatter
 */
public interface Formatter {
    
    /**
     * Renders content of instance of an Automata class in a specific format
     * @param myAutomata   Instance of Automata
     * @return String representation of automata in the format
     */
    public String format(Automata myAutomata);    
}
