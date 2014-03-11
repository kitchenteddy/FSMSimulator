/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.command;

import javax.swing.JOptionPane;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.Label;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.Path;

/**
 *
 * @author teddykitchen
 */
public class CommandCreatePathLabel implements Command{
    
    
    private Automaton fsm;
    private Path path;
    
    
    
    public CommandCreatePathLabel(Path p)
    {
        
        this.path = p;
    }
    
    
    
    
    /**
     * creates the label for the path
     */
    @Override
    public boolean execute()
    {
        String myName = JOptionPane.showInputDialog("input path name");
        if (myName != null){
            Label myLabel = new ModelLabel();
            myLabel.setName(myName);
            this.path.setLabel(myLabel);
            return true;
        }
        else{
            return false;
        }
    }

    
    
}
