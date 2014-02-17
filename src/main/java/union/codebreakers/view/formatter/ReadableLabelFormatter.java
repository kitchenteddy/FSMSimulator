/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

import union.codebreakers.model.Label;

/**
 *
 * @author teddykitchen
 */
public class ReadableLabelFormatter implements FormatterTool{

    @Override
    public String format(Formattable toFormat) {
        
        String toReturn = "";
        FormattableLabel myFormattableLabel = (FormattableLabel)toFormat;
        Label myLabel = myFormattableLabel.getLabel();
        toReturn += myLabel.getName();
        
        
        return toReturn;
    }
    
}
