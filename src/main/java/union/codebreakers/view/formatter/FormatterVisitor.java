/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;
import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.model.*;

/**
 *
 * @author teddykitchen
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
    public String visitElement(FormattableAutomata toFormat, FormatterType myType);
    
}
