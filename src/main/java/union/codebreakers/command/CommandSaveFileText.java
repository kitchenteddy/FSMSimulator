package union.codebreakers.command;

import java.io.PrintWriter;
import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.model.Automaton;
import union.codebreakers.view.ViewText;

/**
 * This commands save the file in selected format into a text file
 */
public class CommandSaveFileText implements Command{
    
    private Automaton fsm;
    private FormatterType formatterType;
    private String path;
    
    public CommandSaveFileText(Automaton newFsm, FormatterType newFT, String destination){
        this.fsm = newFsm;
        this.formatterType = newFT;
        this.path = destination;
    }
    
    @Override
    public boolean execute() {
        boolean res = true;
        ViewText view = new ViewText( this.fsm );
        PrintWriter out;
        try{
            out = new PrintWriter(this.path);
            view.setTypeOutput(this.formatterType);
            out.println(view.getOutput());
            out.flush();
            out.close();
        } catch (Exception e){ // something went wrong ... start passing around beers to kill the pain
            res = false;
        }
        return false;
    }    
}
