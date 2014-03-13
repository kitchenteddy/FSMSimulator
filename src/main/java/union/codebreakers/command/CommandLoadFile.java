package union.codebreakers.command;

import union.codebreakers.helper.Container;

/**
 * This command loads an automaton from a file
 */
public class CommandLoadFile implements Command{

    private Container container;
    
    /**
     * Constructor
     * 
     * @param newContainer Instance of Shared container
     */
    public CommandLoadFile(Container newContainer){
       this.container = newContainer;
    }
    
    /**
     * Executes the command
     * 
     * @return Result of operation
     */
    @Override
    public boolean execute() {
        return false;
    }
}
