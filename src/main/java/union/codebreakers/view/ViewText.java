package union.codebreakers.view;

import union.codebreakers.model.Automaton;
import union.codebreakers.view.formatter.FormattableLabel;
import union.codebreakers.view.formatter.FormattablePath;
import union.codebreakers.view.formatter.FormattableState;


/**
 * String representation of automata
 */
public class ViewText implements View
{
    private Automaton fsm;

    /**
     * Constructor
     * 
     * @param a Instance of automaton connected to this view
     */
    public ViewText(Automaton a){
        this.fsm = a;
    }

    /**
     * Transforms automata into string representation
     * 
     * @return String representation for automata
     */
    public String getOutput() {
        String output = "";
        if( this.fsm != null ){
            FormattableAutomaton fa = new FormattableAutomaton();

        }
        return output;
    }
}

