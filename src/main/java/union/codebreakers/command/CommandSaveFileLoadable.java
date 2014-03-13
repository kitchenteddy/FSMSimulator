/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.command;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.Path;
import union.codebreakers.model.State;
import union.codebreakers.view.formatter.ReadableAutomatonFormatter;

/**
 *
 * @author joshualoew
 */
public class CommandSaveFileLoadable implements Command {
    
    private Automaton fsm;
    private FormatterType formatterType;
    private String path;
    private final String FILE_HEADER = "LABEL,POSITION_X,POSITION_Y,TYPE,OUTGOING_PATHS" + "\n";
    private StringBuilder toSave = new StringBuilder();
    
    FileWriter writer;
    
    public CommandSaveFileLoadable(Automaton newFsm, FormatterType newFT, String destination) {
        this.fsm = newFsm;
        this.formatterType = newFT;
        this.path = destination;
    }
    
    /**
     * Executes the command
     * @return Result of the operation
     */

    @Override
    public boolean execute() {
        boolean res = false;
        
        try {
            writer = buildFile(path);
        } catch (IOException ex) {
            Logger.getLogger(ReadableAutomatonFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        toSave.append(FILE_HEADER);
        
        for (State myState: fsm.getCollectionStates())
        {
            
            toSave.append((myState.getLabel().getName() + ","));
        
            toSave.append(((myState.getPos().x) + ","));
            toSave.append(((myState.getPos().y) + ","));
        
            toSave.append((myState.getType().toString() + ","));
            
            pathToString(myState);
            
            toSave.append("\n");
            
            res = true;

        }
        
        if (res) {
            writeToCsv(toSave);
            closeFile();
        }
        
        return res;
        
    }
    
    private void pathToString(State myState) {
        
        String delim = "";
                
        for (Path myPath: myState.getPaths())
            {
                toSave.append(myPath.getEndPoint().getLabel().getName()).append(delim); 
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
