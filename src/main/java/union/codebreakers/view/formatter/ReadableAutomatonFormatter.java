package union.codebreakers.view.formatter;

import java.awt.Point;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.Path;
import union.codebreakers.model.State;

/**
 *
 */
public class ReadableAutomatonFormatter implements FormatterTool{

    @Override
    public String format(Formattable toFormat) {
        
        final String FILE_HEADER = "LABEL,POSITION,TYPE,OUTGOING_PATHS" + "\n";
        
        String toReturn = "";
        FormattableAutomaton myFormattableAutomata = (FormattableAutomaton)toFormat;
        Automaton myAutomata = myFormattableAutomata.getAutomaton();
        
        toReturn += FILE_HEADER;
        
        for (State myState: myAutomata.getCollectionStates())
        {
            
            toReturn += (myState.getLabel().getName() + ",");
        
            toReturn += (formatPosition(myState.getPos()) + ",");
        
            toReturn += (myState.getType().toString() + ",");
            
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
