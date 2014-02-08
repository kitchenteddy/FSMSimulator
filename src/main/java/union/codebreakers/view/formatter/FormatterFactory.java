/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

import union.codebreakers.helper.FormatterType;

/**
 *
 * @author teddykitchen
 */
public class FormatterFactory {
    
    protected static FormatterFile ff = null;
    
    protected void initFormatterFile()
    {
        FormatterFactory.ff = new FormatterFile();
    }
    
    public Formatter makeFormatter(FormatterType type )
    {
        if (FormatterFactory.ff == null)
        {
           initFormatterFile();
        }
        return FormatterFactory.ff;
    }
    
}
