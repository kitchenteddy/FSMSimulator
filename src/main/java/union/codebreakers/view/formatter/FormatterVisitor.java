
package union.codebreakers.view.formatter;
import union.codebreakers.helper.enums.FormatterType;

/**
 *
 */
public interface FormatterVisitor {
    
    
    /**
     * visit method for State
     * @param toFormat
     * @return 
     */
    public String visitElement(FormattableState toFormat, FormatterType myType);
    
    
    /**
     * visit method for Label
     * @param toFormat
     * @return 
     */
    public String visitElement(FormattableLabel toFormat, FormatterType myType);
    
    
    /**
     * visit method for Path
     * @param toFormat
     * @return 
     */
    public String visitElement(FormattablePath toFormat, FormatterType myType);
    
    
    /**
     * visit method for ModelAutomata
     * @param toFormat
     * @return 
     */
    public String visitElement(FormattableAutomaton toFormat, FormatterType myType);
    
}
