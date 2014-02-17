/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

import union.codebreakers.model.Label;
import union.codebreakers.model.Path;

/**
 *
 * @author teddykitchen
 */
public class ReadablePathFormatter implements FormatterTool{

    @Override
    public String format(Formattable toFormat) {
        String toReturn = "Path Label: ";
        
        FormattablePath myFormattablePath = (FormattablePath)toFormat;
        Path myPath = myFormattablePath.getPath();
        
        
        
        toReturn += myPath.getLabel().getName();
        
        toReturn += "\nPath Type: ";
        toReturn += myPath.getType().toString();
        
        toReturn += "\nEndPoint: ";
        toReturn += myPath.getEndPoint().getLabel().getName();
        
        toReturn += "\n";
        
        
        return toReturn;
        
        
    }
    
}
