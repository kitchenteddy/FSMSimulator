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
     * visit method for State
     * @param toFormat
     * @return 
     */
    public String visitElement(State toFormat);
    
    
    /**
     * visit method for Label
     * @param toFormat
     * @return 
     */
    public String visitElement(Label toFormat);
    
    
    /**
     * visit method for Path
     * @param toFormat
     * @return 
     */
    public String visitElement(Path toFormat);
    
    
    /**
     * visit method for ModelAutomata
     * @param toFormat
     * @return 
     */
    public String visitElement(Automata toFormat);
    
}
