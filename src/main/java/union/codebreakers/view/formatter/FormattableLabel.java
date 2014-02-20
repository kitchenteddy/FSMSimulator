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
    public String acceptFormatter(FormatterVisitor myVisitor, FormatterType myType)
    {
        FormatterTool myFormatter;
        
        switch(myType)
        {
            case eReadable:
                myFormatter = new ReadableLabelFormatter();
                break;
            case eLoadable:
                myFormatter = new LoadableLabelFormatter();
                break;
            default:
                myFormatter = new ReadableLabelFormatter();
                break;
        }
        
        return myFormatter.format(this);
    }
    
    
    
    /**
     * returns the Label in the model representing this Formattable
     * @return 
     */
    public Label getLabel()
    {
        return myLabel;
    }
}
