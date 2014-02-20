
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
            case eReadable:
                myFormatter = new ReadableStateFormatter();
                break;
            case eLoadable:
                myFormatter = new LoadableStateFormatter();
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
