/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;
import union.codebreakers.model.*;

/**
 *
 * @author teddykitchen
 */
public interface FormatterVisitor {
    
    
    /**
     * visit method for ModelState
     * @param toFormat
     * @return 
     */
    public String visitElement(ModelState toFormat);
    
    
    /**
     * visit method for ModelLabel
     * @param toFormat
     * @return 
     */
    public String visitElement(ModelLabel toFormat);
    
    
    /**
     * visit method for ModelPath
     * @param toFormat
     * @return 
     */
    public String visitElement(ModelPath toFormat);
    
    
    /**
     * visit method for ModelAutomata
     * @param toFormat
     * @return 
     */
    public String visitElement(ModelAutomata toFormat);
    
}
