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
    public String acceptFormatter(FormatterVisitor myVisitor, FormatterType myType)
    {
        
        FormatterTool myFormatter;
        
        switch(myType)
        {
            case eReadable:
                myFormatter = new ReadableAutomatonFormatter();
                break;
            case eLoadable:
                myFormatter = new LoadableAutomatonFormatter();
                break;
            default:
                myFormatter = new ReadableAutomatonFormatter();
                break;
        }
        
        return myFormatter.format(this);
        
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
