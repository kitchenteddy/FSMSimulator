/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

import union.codebreakers.model.Automata;
import union.codebreakers.model.Label;

/**
 *
 * @author teddykitchen
 */
public class ReadableAutomataFormatter implements FormatterTool{

    @Override
    public String format(Formattable toFormat) {
        String toReturn = "";
        FormattableAutomata myFormattableAutomata = (FormattableAutomata)toFormat;
        Automata myAutomata = myFormattableAutomata.getAutomata();
        
        
        
        
        return toReturn;
    }
    
}
