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
            //number of States?
            
            
            //get the name of the state
            toReturn += currentState.getLabel().toString();
            toReturn += "~";
            
            //get the position of the state
            toReturn += currentState.getPos().toString();
            toReturn += "~";
            
            //get the type of the state
            Integer typeInteger = (Integer) currentState.getType().ordinal();
            toReturn += typeInteger.toString();
            toReturn += "~";
            
            //get the number of outgoing paths from the state 
            Integer pathInteger = (Integer) currentState.getPathNum();
            toReturn += pathInteger.toString();
            toReturn += "\n";
            
            //iterate through the paths
            
            
          
            
        }
        for (State currentState : myAutomata.getCollectionStates())
        {
            for (Path currentPath : currentState.getPaths())
            {
                //get the destination of the path
                toReturn += currentPath.getEndPoint().getLabel().toString();
                toReturn += "~";
                
                //get the angle of the path
                Integer pathAngle = (Integer)currentPath.getAngle();
                toReturn += pathAngle.toString();
                toReturn += "~";
                
                //get the type of the path
                Integer pathType = (Integer) currentPath.getType().ordinal();
              
                toReturn += "\n";
                
                
                
            }
        }
        
        
        
        
        
        return toReturn;
    
    }
    
    
    
    
    
}
