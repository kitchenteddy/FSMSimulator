
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
    public String acceptFormattable(FormattableState toFormat, FormatterType myType);
    
    
    /**
     * visit method for Label
     * @param toFormat
     * @return 
     */
    public String acceptFormattable(FormattableLabel toFormat, FormatterType myType);
    
    
    /**
     * visit method for Path
     * @param toFormat
     * @return 
     */
    public String acceptFormattable(FormattablePath toFormat, FormatterType myType);
    
    
    /**
     * visit method for ModelAutomata
     * @param toFormat
     * @return 
     */
    public String acceptFormattable(FormattableAutomaton toFormat, FormatterType myType);
    
}
