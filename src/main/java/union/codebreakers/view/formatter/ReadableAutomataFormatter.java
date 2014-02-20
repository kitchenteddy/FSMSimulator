/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

import java.awt.Point;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.Label;
import union.codebreakers.model.Path;
import union.codebreakers.model.State;

/**
 *
 * @author teddykitchen
 */
public class ReadableAutomataFormatter implements FormatterTool{

    @Override
    public String format(Formattable toFormat) {
        
        
        
        String toReturn = "";
        FormattableAutomaton myFormattableAutomata = (FormattableAutomaton)toFormat;
        Automaton myAutomata = myFormattableAutomata.getAutomata();
        
        for (State myState: myAutomata.getCollectionStates())
        {
            
            toReturn += "State Label: ";
            toReturn += myState.getLabel().getName();
        
            toReturn += "\nState Position: ";
            toReturn += formatPosition(myState.getPos());
        
            toReturn += "\nState Type: ";
            toReturn += myState.getType().toString();
            
            toReturn += "\nOutgoing Paths:";
            for (Path myPath: myState.getPaths())
            {
                toReturn += "\nPath Label: ";      
                toReturn += myPath.getLabel().getName();
                
        
                toReturn += "\nPath Type: ";
                toReturn += myPath.getType().toString();
        
                toReturn += "\nEndPoint: ";
                toReturn += myPath.getEndPoint().getLabel().getName();
        
                
            }
            
            
            
            
        }
        
        
        
        
        return toReturn;
    }
    
    
    
    
    
    
    
    
    /**
     * static private helper method for formatting position points correctly
     * @param myPoint
     * @return String representation of a point
     */
    private static String formatPosition(Point myPoint)
    {
        String toReturn = "Position: (";
        Double xVal = (Double)myPoint.getX();
        Double yVal = (Double)myPoint.getY();
        toReturn += xVal.toString();
        toReturn += ", ";
        toReturn += yVal.toString();
        toReturn += ")";
        return toReturn;
        
    }
}
