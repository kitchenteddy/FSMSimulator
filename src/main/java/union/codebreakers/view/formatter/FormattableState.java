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
public class FormattableState implements Formattable{
    
    
    
    
    private ModelState myModel;
    
    
    /**
     * accept method for things that are visitable by the formatter
     * @param myVisitor
     * @return 
     */
    public String acceptFormatter(FormatterVisitor myVisitor)
    {
        return myVisitor.visitElement(myModel);
    }
    
}
