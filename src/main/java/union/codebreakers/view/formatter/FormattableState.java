
package union.codebreakers.view.formatter;

import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.model.*;

/**
 *
 */
public class FormattableState implements Formattable{
    
    
    
    
    private State myState;
    
    
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
            case eLatex:
                myFormatter = new LatexStateFormatter();
                break;
            case eReadable:
                myFormatter = new ReadableStateFormatter();
                break;
            default:
                myFormatter = new ReadableStateFormatter();
                break;
        }
        
        return myFormatter.format(this);
        
        
    }
    
    
    /**
     * returns the state in the model representing this Formattable
     * @return 
     */
    public State getState()
    {
        return myState;
    }
}
