/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

import union.codebreakers.model.Automata;
import union.codebreakers.model.State;

/**
 *
 * @author teddykitchen
 */
public class FormatterFile implements Formatter{
    
    
       
    public FormatterFile(){
        
        
    }
    
    
/**
 * Formats the automata into a readable string
 * @param currentAutomata
 * @return 
 */
    @Override
    public String format(Automata currentAutomata) {
        
        int linesNum = 0;
        String toReturn = "";
        
        
        for (State currentState : currentAutomata.getCollectionStates())
        {
            toReturn += "";
        }
        
        
        
        
        return toReturn;
    
    }
    
    
    
    
    
}
