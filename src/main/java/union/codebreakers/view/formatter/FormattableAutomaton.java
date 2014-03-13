package union.codebreakers.view.formatter;
import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.model.*;
/**
 *
 */
public class FormattableAutomaton implements Formattable{
    
    private Automaton fsm;
    
    public FormattableAutomaton(Automaton myModel)
    {
        this.fsm = myModel;
    }
    
    /**
     * accept method for things that are visitable by the formatter
     * @param myVisitor
     * @return 
     */
    public String visitFormatter(FormatterVisitor fv, FormatterType myType)
    {
        return fv.acceptFormattable(this, myType);
    }
    
    
    /**
     * returns the state in the model representing this Formattable
     * @return 
     */
    public Automaton getAutomaton()
    {
        return fsm;
    }
    
    
    
    
}
