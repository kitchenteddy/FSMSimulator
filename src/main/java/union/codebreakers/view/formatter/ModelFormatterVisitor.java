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
public class ModelFormatterVisitor implements FormatterVisitor {

    
    /**
     * visit method for ModelState
     * @param toFormat
     * @return 
     */
    @Override
    public String visitElement(State toFormat) {
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
     * visit method for Label
     * @param toFormat
     * @return 
     */
    @Override
    public String visitElement(Label toFormat) {
        return toFormat.getName();
    }
    
    /**
     * visit method for Path
     * @param toFormat
     * @return 
     */
    @Override
    public String visitElement(Path toFormat) {

        String toReturn = "Path Label: ";
        
        toReturn += toFormat.getLabel().getName();
        
        toReturn += "\nPath Type: ";
        
        toReturn += toFormat.getType().toString();
       
        return toReturn;
        
        
    }
   
    
    
    
    /**
     * visit method for Automata
     * @param toFormat
     * @return 
     */
    public String visitElement(Automata toFormat)
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
