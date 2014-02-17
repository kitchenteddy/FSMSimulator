/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

import java.awt.Point;
import union.codebreakers.model.Label;
import union.codebreakers.model.State;

/**
 *
 * @author teddykitchen
 */
public class ReadableStateFormatter implements FormatterTool{

    @Override
    public String format(Formattable toFormat) {

    String toReturn = "";
        FormattableState myFormattableState = (FormattableState)toFormat;
        State myState = myFormattableState.getState();
        
        toReturn += "State Label: ";
        toReturn += myState.getLabel().getName();
        
        toReturn += "\nState Position: ";
        toReturn += formatPosition(myState.getPos());
        
        toReturn += "\nState Type: ";
        toReturn += myState.getType().toString();
        
        
        
        
        
        
        
        
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
