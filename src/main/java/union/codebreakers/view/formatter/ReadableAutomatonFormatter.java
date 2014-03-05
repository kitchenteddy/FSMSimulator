package union.codebreakers.view.formatter;

import union.codebreakers.model.Automaton;
import union.codebreakers.model.Path;
import union.codebreakers.model.State;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class ReadableAutomatonFormatter implements FormatterTool{
    
    final String FILE_NAME = "/Users/joshualoew/NetBeansProjects/saveState.csv";
    final String FILE_HEADER = "LABEL,POSITION_X,POSITION_Y,TYPE,OUTGOING_PATHS" + "\n";
    StringBuilder toReturn = new StringBuilder();
    
    FileWriter writer;

    @Override
    public String format(Formattable toFormat) {
        
        try {
            writer = buildFile(FILE_NAME);
        } catch (IOException ex) {
            Logger.getLogger(ReadableAutomatonFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        FormattableAutomaton myFormattableAutomata = (FormattableAutomaton)toFormat;
        Automaton myAutomata = myFormattableAutomata.getAutomaton();
        
        toReturn.append(FILE_HEADER);
        
        for (State myState: myAutomata.getCollectionStates())
        {
            
            toReturn.append((myState.getLabel().getName() + ","));
        
            toReturn.append(((myState.getPos().x) + ","));
            toReturn.append(((myState.getPos().y) + ","));
        
            toReturn.append((myState.getType().toString() + ","));
            
            pathToString(myState);
            
            toReturn.append("\n");

        }
        
        writeToCsv(toReturn);
        closeFile();
        
        return toReturn.toString();
        
    }
    
    private void pathToString(State myState) {
        
        String delim = "";
                
        for (Path myPath: myState.getPaths())
            {
                toReturn.append(myPath.getLabel().getName()).append(delim); 
                delim = ",";
            }
        
    }
    
    private FileWriter buildFile(String FILE_NAME) throws IOException {
        
        return new FileWriter(FILE_NAME);
        
    }
    
    private void writeToCsv(StringBuilder toReturn) {
        
        try {
            writer.append(toReturn);
        } catch (IOException ex) {
            Logger.getLogger(ReadableAutomatonFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void closeFile() {
        
        try {
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadableAutomatonFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
