/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

import union.codebreakers.model.ModelAutomata;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelPath;
import union.codebreakers.model.ModelState;
import java.awt.Point;

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
    public String visitElement(ModelState toFormat) {
      String toReturn = "";
      
      toReturn += "State Label: ";
      toReturn += toFormat.getLabel().getName();
      
      toReturn += "\nState Type: ";
      toReturn += toFormat.getType().toString();
      
      
      toReturn += "\nState ";
      toReturn += formatPosition(toFormat.getPos());
      
      
      toReturn += "\nNumber of outgoing paths: ";
      Integer pathsNum = (Integer)toFormat.getPathNum();
      toReturn += pathsNum.toString();
      
      
      
      
      return toReturn;
      
    }

    
    /**
     * visit method for ModelLabel
     * @param toFormat
     * @return 
     */
    @Override
    public String visitElement(ModelLabel toFormat) {
        return toFormat.getName();
    }
    
    /**
     * visit method for ModelPath
     * @param toFormat
     * @return 
     */
    @Override
    public String visitElement(ModelPath toFormat) {

        String toReturn = "Path Label: ";
        
        toReturn += toFormat.getLabel().getName();
        
        toReturn += "\nPath Type: ";
        
        toReturn += toFormat.getType().toString();
       
        return toReturn;
        
        
    }
   
    
    
    
    /**
     * visit method for ModelAutomata
     * @param toFormat
     * @return 
     */
    public String visitElement(ModelAutomata toFormat)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
