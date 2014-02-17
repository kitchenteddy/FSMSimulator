/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

import union.codebreakers.helper.FormatterType;
import union.codebreakers.view.formatter.FormatterVisitor;

/**
 *
 * @author teddykitchen
 */
public interface Formattable {
    
    
    /**
     * accept method for things that are visitable by the formatter
     * @param myVisitor
     * @param myType
     * @return 
     */
    public String acceptFormatter(FormatterVisitor myVisitor, FormatterType myType);
}
