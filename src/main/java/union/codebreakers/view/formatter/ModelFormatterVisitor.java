/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

import union.codebreakers.model.*;

import java.awt.Point;
import union.codebreakers.helper.FormatterType;

/**
 *
 * @author teddykitchen
 */
public class ModelFormatterVisitor implements FormatterVisitor {

    
    /**
     * visit method for ModelState
     * @param toFormat
     * @return 
     */
    @Override
   
    //Should this take a State or a formattable state?
    // Initially easier to do it this way but may need
    // to be changed in all these methods later.
    public String visitElement(FormattableState toFormat, FormatterType myType) {
        return toFormat.acceptFormatter(this, myType);
      
    }

    
    /**
     * visit method for Label
     * @param toFormat
     * @return 
     */
    @Override
    public String visitElement(FormattableLabel toFormat, FormatterType myType) {
        return toFormat.acceptFormatter(this, myType);
    }
    
    /**
     * visit method for Path
     * @param toFormat
     * @return 
     */
    @Override
    public String visitElement(FormattablePath toFormat, FormatterType myType) {

        return toFormat.acceptFormatter(this, myType);
        
        
    }
   
    
    
    
    /**
     * visit method for Automata
     * @param toFormat
     * @return 
     */
    public String visitElement(FormattableAutomata toFormat, FormatterType myType)
    {
        return toFormat.acceptFormatter(this, myType);
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
