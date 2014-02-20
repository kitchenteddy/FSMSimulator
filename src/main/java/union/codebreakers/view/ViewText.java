package union.codebreakers.view;

import union.codebreakers.model.Automaton;


/**
 * String representation of automata
 */
public class ViewText implements View
{
    /**
     * Automata for this view
     */
    public Automaton automata;
	
    /**
     * Constructor
     */
    public ViewText(){
            super();
    }

    /**
     * Transforms automata into string representation
     * 
     * @return String representation for automata
     */
    public String getOutput() {
            return "";	
    }
}

