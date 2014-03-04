package union.codebreakers.command;

/**
 * Center class for commands. This class will take care of executing all commands in proper way
 */
public class CommandCenter {
    
    
    /**
     * Executes command. Enables to add pre-operations and post-operations for handling execution of a command
     * 
     * @param command Command to be executed
     * @return Resulf of executed command
     */
    public boolean execute( Command command ){
        return command.execute();
    }
}
