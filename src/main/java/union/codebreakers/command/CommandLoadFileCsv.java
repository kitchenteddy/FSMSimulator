/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import union.codebreakers.model.ModelAutomaton;

/**
 *
 * @author joshualoew
 */
public class CommandLoadFileCsv implements Command {
    
    private ModelAutomaton fsm;
    private File toLoad;
    
    public CommandLoadFileCsv(File toLoad) {
        fsm = new ModelAutomaton();
        this.toLoad = toLoad;
    }

    @Override
    public boolean execute() {
        boolean res = false;
        
        try {
            Scanner inputStream = new Scanner(toLoad);
            
            while (inputStream.hasNext()) {
                String data = inputStream.next();
                System.out.println(data);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CommandLoadFileCsv.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return res;
        
    }
    
}
