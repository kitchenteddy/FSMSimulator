package union.codebreakers.view;

import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.model.Automaton;
import union.codebreakers.view.formatter.FormattableAutomaton;
import union.codebreakers.view.formatter.FormatterVisitor;
import union.codebreakers.view.formatter.ModelFormatterVisitor;


/**
 * String representation of automata
 */
public class ViewText implements View
{
    private Automaton fsm;
    private FormatterType ft;

    /**
     * Constructor
     * 
     * @param a Instance of automaton connected to this view
     */
    public ViewText(Automaton a){
        this.fsm = a;
    }
    
    public void setTypeOutput(FormatterType ft){
        this.ft = ft;
    }

    /**
     * Transforms automata into string representation
     * 
     * @return String representation for automata
     */
    public String getOutput() {
        String output = "";
        FormatterVisitor fv = new ModelFormatterVisitor();
        if( this.fsm != null ){
            FormattableAutomaton fa = new FormattableAutomaton(fsm);
            output = fa.acceptFormatter(null, this.ft);
        }
        return output;
    }
}

