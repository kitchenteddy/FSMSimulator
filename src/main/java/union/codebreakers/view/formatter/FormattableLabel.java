package union.codebreakers.view.formatter;

import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.model.*;

/**
 *
 */
public class FormattableLabel implements Formattable
{
    
    private Label myLabel;
    
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
     * returns the Label in the model representing this Formattable
     * @return 
     */
    public Label getLabel()
    {
        return myLabel;
    }
    
    /**
     * returns the Label in the model representing this Formattable
     * 
     * @paran newLabel  new label
     */
    public void setLabel(Label newLabel)
    {
        this.myLabel = newLabel;
    }
}
