package union.codebreakers.command;

import union.codebreakers.model.State;

/**
 * This command takes care of adding a new path between two states
 */
public class CommandCreatePath implements Command{

    private State from, to;
    
    /**
     * Constructor
     * 
     * @param newFrom    Starting point for path
     * @param newTo      Ending point for path
     */
    public CommandCreatePath(State newFrom, State newTo){
        this.from = newFrom;
        this.to = newTo;
    }
    
    /**
    * This method executes command
    * 
    * @return Whether the execution was successful or not
    */
    @Override
    public boolean execute() {        
        this.from.addPath(to);
        
        // add creating label here
        return true;
    }
}