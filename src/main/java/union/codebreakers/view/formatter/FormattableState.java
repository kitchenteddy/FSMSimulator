
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
    public String visitFormatter(FormatterVisitor fv, FormatterType myType)
    {
        return fv.acceptFormattable(this, myType);
    }
    
    /**
     * returns the state in the model representing this Formattable
     * @return 
     */
    public State getState()
    {
        return myState;
    }
    
    /**
     * returns the state in the model representing this Formattable
     * @param   newState    New state
     */
    public void setState(State newState)
    {
        this.myState = newState;
    }
}
