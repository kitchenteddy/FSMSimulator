/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;
import union.codebreakers.helper.FormatterType;
import union.codebreakers.model.*;
/**
 *
 * @author teddykitchen
 */
public class FormattablePath implements Formattable{
    
    
    
    
    
    
    private Path myModel;
    
    
    /**
     * accept method for things that are visitable by the formatter
     * @param myVisitor
     * @return 
     */
    public String acceptFormatter(FormatterVisitor myVisitor, FormatterType myType)
    {
        
        return myVisitor.visitElement(this, myType);
    }
    
}
