/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

import union.codebreakers.model.*;
import java.awt.Point;

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
    public String format(Automata myAutomata) {
        
        int linesNum = 0;
        String toReturn = "";
        
        
        for (State currentState : myAutomata.getCollectionStates())
        {
            //number of lines
            toReturn += "\n";
            toReturn += currentState.getName();
            toReturn += "\n";
            toReturn += currentState.getPos().toString();
            toReturn += "\n";
            Integer myInteger = (Integer) currentState.getType().ordinal();
            toReturn += myInteger.toString();
            toReturn += "\n";
            toReturn += "OUTGOING PATHS:";
            //iterate through the paths
            for (Path currentPath: currentState.getPaths())
            {
                
            }
            
            
            
        }
        
        
        
        
        return toReturn;
    
    }
    
    
    
    
    
}
